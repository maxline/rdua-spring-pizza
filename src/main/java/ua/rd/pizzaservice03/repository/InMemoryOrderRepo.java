package ua.rd.pizzaservice03.repository;

import ua.rd.pizzaservice03.domain.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * не умеет создавать order , умеет искать
 * по сути repository это dao
 */
public class InMemoryOrderRepo implements OrderRepo {

    private final List<Order> orders = new ArrayList();


    @Override
    public void save(Order newOrder) {
        orders.add(newOrder);
    }


}
