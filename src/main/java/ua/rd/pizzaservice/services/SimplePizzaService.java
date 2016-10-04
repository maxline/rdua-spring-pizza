package ua.rd.pizzaservice.services;

import ua.rd.pizzaservice.domain.Pizza;
import ua.rd.pizzaservice.repository.InMemoryPizzaRepo;
import ua.rd.pizzaservice.repository.PizzaRepo;


public class SimplePizzaService implements PizzaService{

    private PizzaRepo pizzaRepo = new InMemoryPizzaRepo();

    @Override
    public Pizza find(Integer id) {
        return pizzaRepo.find(id);
    }
}
