package ua.rd.pizzaservice04.services;

import ua.rd.pizzaservice04.domain.Pizza;
import ua.rd.pizzaservice04.infrastructure.InitialContext;
import ua.rd.pizzaservice04.repository.PizzaRepo;


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
