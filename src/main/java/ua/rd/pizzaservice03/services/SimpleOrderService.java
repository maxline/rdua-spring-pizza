package ua.rd.pizzaservice03.services;

import ua.rd.pizzaservice03.domain.Customer;
import ua.rd.pizzaservice03.domain.Order;
import ua.rd.pizzaservice03.domain.Pizza;
import ua.rd.pizzaservice03.repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * пицца, кастомер, ордер
 */
public class SimpleOrderService implements OrderService {
    private final PizzaService pizzaService;
    private final OrderRepository orderRepository;

    public SimpleOrderService(PizzaService pizzaService, OrderRepository orderRepository) {
        this.pizzaService = pizzaService;
        this.orderRepository = orderRepository;
    }

    @Override
    public Order placeNewOrder(Customer customer, int... pizzaID) {
        List<Pizza> pizzas = new ArrayList<>();

        for (Integer id : pizzaID) {
            pizzas.add(findPizzaByID(id));  // get Pizza from predifined in-memory list
        }
        Order newOrder = new Order(customer, pizzas);

        saveOrder(newOrder);  // set Order Id and save Order to in-memory list
        return newOrder;
    }


    private Pizza findPizzaByID(Integer id) {

        return pizzaService.find(id);
    }

    private void saveOrder(Order newOrder) {
        orderRepository.save(newOrder);
    }

}




