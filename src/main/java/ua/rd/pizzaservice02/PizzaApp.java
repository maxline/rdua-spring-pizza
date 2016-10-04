package ua.rd.pizzaservice02;

import ua.rd.pizzaservice.domain.Customer;
import ua.rd.pizzaservice.domain.Order;
import ua.rd.pizzaservice.domain.Pizza;
import ua.rd.pizzaservice.services.PizzaService;
import ua.rd.pizzaservice.services.SimpleOrderService;
import ua.rd.pizzaservice.services.SimplePizzaService;

public class PizzaApp {
    public static void main(String[] args) {
//        Customer customer = null;
//        Order order;
//
//        SimpleOrderService orderService = new SimpleOrderService();
//        order = orderService.placeNewOrder(customer, 1, 2, 3);
//
//        System.out.println(order);


        PizzaService pizzaService = new SimplePizzaService() ;
        System.out.println(pizzaService.find(1));

    }
}