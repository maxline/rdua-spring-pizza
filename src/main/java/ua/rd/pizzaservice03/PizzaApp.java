package ua.rd.pizzaservice03;

import ua.rd.pizzaservice03.repository.PizzaRepo;
import ua.rd.pizzaservice03.services.PizzaService;
import ua.rd.pizzaservice03.services.SimplePizzaService;
import ua.rd.pizzaservice03.domain.Customer;
import ua.rd.pizzaservice03.infrastructure.ApplicationContext;
import ua.rd.pizzaservice03.infrastructure.Context;
import ua.rd.pizzaservice03.infrastructure.JavaConfig;

public class PizzaApp {
    public static void main(String[] args) {
        Customer customer = null;
//        Order order;
//
//        SimpleOrderService orderService = new SimpleOrderService();
//        order = orderService.placeNewOrder(customer, 1, 2, 3);
//
//        System.out.println(order);


        Context context = new ApplicationContext(new JavaConfig()); // кОнтекст управляет жизненным циклом
        //проверяем что контекст подымается и создает наш бин
        //можно проверить если подряд вызвать гетБин, будет один и тот же объект


        PizzaRepo pizzaRepo = context.getBean("pizzaRepository");

        PizzaService pizzaService = new SimplePizzaService();
        System.out.println(pizzaService.find(1));


        //
//        OrderService orderService = context.getBean("orderService");
//
//        Order order = orderService.placeNewOrder(customer, 1, 2, 3);
//

        //пытаемся создать конструктор объекта
        //вызываем рефлекшн с параметрами (передаем массив объектов с которым должен быть вызван конструктор)
        //объекты можем получить либо из контекста, если их еще нет, то создаем
        //достаем тип преобразываем в строку, если нету то пытаемся создать рекурсивно

    }
}