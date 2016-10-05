package ua.rd.pizzaservice04.infrastructure;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ApplicationContext implements Context {
    private final Config config;
    private final Map<String, Object> beans = new HashMap<>();

    public ApplicationContext(Config config) {
        this.config = config;
    }

    @Override
    public <T> T getBean(String beanName) {

        Class<?> type = config.getImpl(beanName);
        Object bean = beans.get(beanName);

        if (bean != null) {
            return (T) bean;
        }

        BeanBuilder builder = new BeanBuilder(type);
        builder.createBean();
        //builder.createBeanProxy();
        //builder.callPostCreateMethod();
        builder.callInitMethod();
        bean = builder.build();
        beans.put(beanName, bean);

        return (T) bean;
    }

    class BeanBuilder {

        private final Class<?> type;
        private Object bean;

        public BeanBuilder(Class<?> type) {
            this.type = type;
        }

        public void callInitMethod(){
            Class<?> clazz = bean.getClass();
            Method method;

            try{
                method = clazz.getMethod("init");
            } catch(NoSuchMethodException ex) {
                System.out.println("cathed init");
                //ex.printStackTrace();
                return;
            }
            method.invoke(bean);

        }

        public void createBean() {

            Constructor<?> constructor = type.getConstructors()[0];
            if (constructor.getParameterCount() == 0) {
                try {
                    Object bean = type.newInstance();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            } else {

                Class<?>[] parameterTypes = constructor.getParameterTypes();
                Object[] params = new Object[parameterTypes.length];

                for (int i = 0; i < constructor.getParameterCount(); i++) {

                    String beanName = convertTypeToBeanName(parameterTypes[i]);
                    params[i] = getBean(beanName);

                    //todo доделать


                }
                T bean = (T) constructor.newInstance(params);
                beans.put(beanName, bean);

            }

        }

    }



}
