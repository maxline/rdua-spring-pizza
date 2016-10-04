package ua.rd.pizzaservice.repository;

import ua.rd.pizzaservice.domain.Order;

/**
 *
 */
public interface OrderRepo {

    void save(Order newOrder);
}
