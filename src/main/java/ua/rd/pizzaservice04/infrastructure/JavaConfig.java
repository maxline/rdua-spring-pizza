package ua.rd.pizzaservice04.infrastructure;

import ua.rd.pizzaservice04.repository.InMemoryOrderRepo;
import ua.rd.pizzaservice04.repository.InMemoryPizzaRepo;
import ua.rd.pizzaservice04.services.SimpleOrderService;
import ua.rd.pizzaservice04.services.SimplePizzaService;

import java.util.HashMap;
import java.util.Map;

public class JavaConfig  implements Config {

    private Map<String, Class<?>> classes = new HashMap<>();  // то же самое как мы бы написали еще одну вложенную Мапу требующую параметризацию
    {
        classes.put("pizzaRepository", InMemoryPizzaRepo.class);
        classes.put("orderRepository", InMemoryOrderRepo.class);
        classes.put("orderService", SimpleOrderService.class);
        classes.put("pizzaService", SimplePizzaService.class);
    }

    @Override
    public Class<?> getImpl(String name) {
        return classes.get(name);
    }
}
