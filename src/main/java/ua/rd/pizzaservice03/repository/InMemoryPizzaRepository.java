package ua.rd.pizzaservice03.repository;

import ua.rd.pizzaservice03.domain.Pizza;
import ua.rd.pizzaservice03.domain.PizzaType;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class InMemoryPizzaRepository implements PizzaRepository {

    private final Map<Integer, Pizza> pizzas = new HashMap<Integer, Pizza>() ;   //static не нужен, в одном эксемпляре в контейнере

    public void init(){
        pizzas.put(1, new Pizza(1L, "pizza1", new BigDecimal(100.00), PizzaType.VEGETARIAN));
        pizzas.put(2, new Pizza(2L, "pizza2", new BigDecimal(120.00), PizzaType.SEA));
        pizzas.put(3, new Pizza(3L, "pizza1", new BigDecimal(150.00), PizzaType.MEAT));

    }

    @Override
    public Pizza find(Integer id) {
        return pizzas.get(id);
    }
}
