package ua.rd.pizzaservice02.services;

import ua.rd.pizzaservice02.domain.Customer;
import ua.rd.pizzaservice02.domain.Order;
import ua.rd.pizzaservice02.domain.Pizza;
import ua.rd.pizzaservice02.repository.InMemoryOrderRepo;
import ua.rd.pizzaservice02.repository.InMemoryPizzaRepo;
import ua.rd.pizzaservice02.repository.OrderRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * пицца, кастомер, ордер
 */
public class SimpleOrderService  implements OrderService {
    private final InMemoryPizzaRepo pizzaService = new InMemoryPizzaRepo();
    private final OrderRepo orderRepo = new InMemoryOrderRepo();

    public Order placeNewOrder(Customer customer, Integer... pizzasID) {
        List<Pizza> pizzas = new ArrayList<>();

        for (Integer id : pizzasID) {
            pizzas.add(findPizzaByID(id));  // get Pizza from predifined in-memory list
        }
        Order newOrder = new Order(customer, pizzas);

        saveOrder(newOrder);  // set Order Id and save Order to in-memory list
        return newOrder;
    }

    private Pizza findPizzaByID(Integer id){

        return pizzaService.find(id);
    }

    private void saveOrder(Order newOrder){
        orderRepo.save(newOrder);
    }

}




