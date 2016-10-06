package ua.rd.pizzaservice03;

import ua.rd.pizzaservice03.domain.Customer;
import ua.rd.pizzaservice03.domain.Order;
import ua.rd.pizzaservice03.infrastructure.ApplicationContext;
import ua.rd.pizzaservice03.infrastructure.Context;
import ua.rd.pizzaservice03.infrastructure.JavaConfig;
import ua.rd.pizzaservice03.services.OrderService;

public class PizzaApp {
    public static void main(String[] args) {
        Customer customer = null;

//        SimpleOrderService orderService = new SimpleOrderService();
//        order = orderService.placeNewOrder(customer, 1, 2, 3);
//
//        System.out.println(order);


        Context context = new ApplicationContext(new JavaConfig()); // кОнтекст управляет жизненным циклом
        //проверяем что контекст подымается и создает наш бин
        //можно проверить если подряд вызвать гетБин, будет один и тот же объект


        //System.out.println(pizzaRepository.find(1));


        OrderService orderService = context.getBean("orderService");
        Order order = orderService.placeNewOrder(customer, 1, 2, 3);
        System.out.println(order);

        //пытаемся создать конструктор объекта
        //вызываем рефлекшн с параметрами (передаем массив объектов с которым должен быть вызван конструктор)
        //объекты можем получить либо из контекста, если их еще нет, то создаем
        //достаем тип преобразываем в строку, если нету то пытаемся создать рекурсивно

    }
}