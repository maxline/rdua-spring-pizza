package ua.rd.pizzaservice03.infrastructure;

public interface Context {
    <T> T getBean(String beanName);  //объекты которыми управляет кОнтекст будем называть бинами
}
