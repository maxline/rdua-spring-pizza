package ua.rd.pizzaservice03.repository;

import ua.rd.pizzaservice03.domain.Pizza;

public interface PizzaRepo {
    Pizza find(Integer id);
}
