package ua.rd.pizzaservice02.repository;

import ua.rd.pizzaservice.domain.Pizza;
import ua.rd.pizzaservice.domain.PizzaType;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class InMemoryPizzaRepo implements PizzaRepo {

    private static final Map<Integer, Pizza> PIZZAS_DEFAULT = new HashMap<Integer, Pizza>() {{
        put(1, new Pizza(1L, "pizza1", new BigDecimal(100.00), PizzaType.VEGETARIAN));
        put(2, new Pizza(2L, "pizza2", new BigDecimal(120.00), PizzaType.SEA));
        put(3, new Pizza(3L, "pizza1", new BigDecimal(150.00), PizzaType.MEAT));
    }};


    public Pizza find(Integer id) {
        return PIZZAS_DEFAULT.get(id);
    }

}
