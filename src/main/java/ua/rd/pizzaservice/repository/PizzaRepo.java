package ua.rd.pizzaservice.repository;

import ua.rd.pizzaservice.domain.Pizza;

/**
 *
 */
public interface PizzaRepo {
    Pizza find(Integer id);
}
