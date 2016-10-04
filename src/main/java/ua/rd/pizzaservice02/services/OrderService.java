package ua.rd.pizzaservice02.services;

import ua.rd.pizzaservice02.domain.Customer;
import ua.rd.pizzaservice02.domain.Order;

public interface OrderService {

    Order placeNewOrder(Customer customer, Integer... ids);

}
