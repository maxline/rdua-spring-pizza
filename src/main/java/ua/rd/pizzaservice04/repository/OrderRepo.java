package ua.rd.pizzaservice04.repository;

import ua.rd.pizzaservice04.domain.Order;

public interface OrderRepo {

    void save(Order newOrder);
}
