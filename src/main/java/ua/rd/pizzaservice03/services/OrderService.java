package ua.rd.pizzaservice03.services;

import ua.rd.pizzaservice03.domain.Customer;
import ua.rd.pizzaservice03.domain.Order;

public interface OrderService {

    Order placeNewOrder(Customer customer, Integer... ids);

}
