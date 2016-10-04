package ua.rd.pizzaservice.services;

import ua.rd.pizzaservice.domain.Customer;
import ua.rd.pizzaservice.domain.Order;
import ua.rd.pizzaservice.domain.Pizza;
import ua.rd.pizzaservice.repository.InMemoryOrderRepo;
import ua.rd.pizzaservice.repository.InMemoryPizzaRepo;
import ua.rd.pizzaservice.repository.OrderRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * пицца, кастомер, ордер
 */
public class SimpleOrderService  implements OrderService{
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




