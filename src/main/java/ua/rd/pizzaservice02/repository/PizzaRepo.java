package ua.rd.pizzaservice02.repository;

import ua.rd.pizzaservice02.domain.Pizza;

/**
 *
 */
public interface PizzaRepo {
    Pizza find(Integer id);
}
