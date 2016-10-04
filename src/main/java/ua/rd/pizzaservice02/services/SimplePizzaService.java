package ua.rd.pizzaservice02.services;

import ua.rd.pizzaservice.domain.Pizza;
import ua.rd.pizzaservice.repository.PizzaRepo;
import ua.rd.pizzaservice02.infrastructure.InitialContext;


public class SimplePizzaService implements PizzaService {

    private PizzaRepo pizzaRepo;


    public SimplePizzaService() {
        InitialContext context = new InitialContext();
        this.pizzaRepo = context.getInstance("pizzaRepository"); // по имени должен вернуть интстанс, экземпляр класса
    }

    @Override
    public Pizza find(Integer id) {
        return pizzaRepo.find(id);
    }
}
