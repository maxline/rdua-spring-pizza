package ua.rd.pizzaservice02.repository;

import ua.rd.pizzaservice02.domain.Order;

/**
 *
 */
public interface OrderRepo {

    void save(Order newOrder);
}
