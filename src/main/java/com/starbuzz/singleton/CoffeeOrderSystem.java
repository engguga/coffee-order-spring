package com.starbuzz.singleton;

import com.starbuzz.decorator.Coffee;
import com.starbuzz.model.CoffeeOrder;
import com.starbuzz.repository.CoffeeOrderRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class CoffeeOrderSystem {

    private final CoffeeOrderRepository repository;

    public CoffeeOrderSystem(CoffeeOrderRepository repository) {
        this.repository = repository;
    }

    public void placeOrder(Coffee coffee) {
        CoffeeOrder order = new CoffeeOrder(coffee.getDescription(), BigDecimal.valueOf(coffee.getCost()));
        repository.save(order);
        System.out.println("Pedido salvo no banco:\nDescrição: " + order.getDescription() + "\nPreço: R$ " + order.getPrice());
    }

    public List<CoffeeOrder> getOrders() {
        return repository.findAll();
    }
}
