package ua.rd.pizzaservice03.services;

import ua.rd.pizzaservice03.domain.Pizza;
import ua.rd.pizzaservice03.repository.PizzaRepository;
import ua.rd.pizzaservice03.infrastructure.InitialContext;


public class SimplePizzaService implements PizzaService {

    private PizzaRepository pizzaRepository;

    public SimplePizzaService(PizzaRepository pizzaRepository) {
        // InitialContext context = new InitialContext();
        // this.pizzaRepository = (PizzaRepository) context.getInstance("pizzaRepository");
        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public Pizza find(Integer id) {
        return pizzaRepository.find(id);
    }
}
