package ua.rd.pizzaservice03.services;

import ua.rd.pizzaservice03.domain.Pizza;
import ua.rd.pizzaservice03.repository.PizzaRepo;
import ua.rd.pizzaservice03.infrastructure.InitialContext;


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
