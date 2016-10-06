package ua.rd.pizzaservice03.repository;

import ua.rd.pizzaservice03.domain.Order;

public interface OrderRepository {

    Order save(Order newOrder);
}
