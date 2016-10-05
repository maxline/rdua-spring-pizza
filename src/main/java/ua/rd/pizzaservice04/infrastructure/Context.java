package ua.rd.pizzaservice04.infrastructure;

public interface Context {
    <T> T getBean(String beanName);  //объекты которыми управляет кОнтекст будем называть бинами
}
