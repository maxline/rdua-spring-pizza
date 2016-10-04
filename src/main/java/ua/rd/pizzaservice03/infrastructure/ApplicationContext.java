package ua.rd.pizzaservice03.infrastructure;

import org.omg.CORBA.Object;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class ApplicationContext implements Context {
    private final Config config;
    private final Map<String, Object> beans = new HashMap<>();

    public ApplicationContext(Config config) {
        this.config = config;

    }

    @Override
    public <T> T getBean(String beanName) {

        if (beans.containsKey(beanName)) {
            return (T) beans.get(beanName);
        }

        Class<?> type = config.getImpl(beanName);

        Constructor<?> constructor =type.getConstructors()[];
        if (constructor.getParameterCount() == 0) {

            try {
                T bean = (T) type.newInstance();
                beans.put(beanName, bean);
                return (T) type.newInstance();  // todo ??
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        } else {
            Class<?>[] parameterTypes = constructor.getParameterTypes();


            Object[] params = new Object[constructor.getParameterCount()];
            for(int i=0; i< constructor.getParameterCount(); i++){

                String beanName = convertTypeToBeanName(parameterTypes[i]);
                params[i] = getBean(beanName);

                //todo доделать


            }
            T bean = (T) constructor.newInstance(params);
            beans.put(beanName, bean);
            return bean;
        }
    }
}
