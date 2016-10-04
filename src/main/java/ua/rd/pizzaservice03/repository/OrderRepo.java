package ua.rd.pizzaservice03.repository;

import ua.rd.pizzaservice03.domain.Order;

public interface OrderRepo {

    void save(Order newOrder);
}
