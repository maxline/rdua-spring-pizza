package ua.rd.pizzaservice02.infrastructure;

import ua.rd.pizzaservice02.repository.InMemoryPizzaRepo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class JavaConfig  implements Config{

    private Map<String, Class<?>> classes = new HashMap<>();  // то же самое как мы бы написали еще одну вложенную Мапу требующую параметризацию
    {
        classes.put("pizzaRepository", InMemoryPizzaRepo.class);
    }

    @Override
    public Class<?> getImpl(String name) {
        return classes.get(name);
    }
}
