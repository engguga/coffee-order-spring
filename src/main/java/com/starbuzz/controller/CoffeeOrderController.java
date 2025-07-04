package com.starbuzz.controller;

import com.starbuzz.builder.CoffeeBuilder;
import com.starbuzz.decorator.Coffee;
import com.starbuzz.exception.InvalidIngredientException;
import com.starbuzz.model.CoffeeOrder;
import com.starbuzz.singleton.CoffeeOrderSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order")
public class CoffeeOrderController {

    @Autowired
    private CoffeeOrderSystem coffeeOrderSystem;

    @PostMapping
    public String placeOrder(@RequestBody List<String> extras) {
        CoffeeBuilder builder = new CoffeeBuilder();

        for (String extra : extras) {
            switch (extra.toLowerCase()) {
                case "milk" -> builder.withMilk();
                case "whippedcream" -> builder.withWhippedCream();
                case "chocolate" -> builder.withChocolate();
                case "caramel" -> builder.withCaramel();
                default -> throw new InvalidIngredientException(extra);
            }
        }

        Coffee coffee = builder.build();
        coffeeOrderSystem.placeOrder(coffee);

        return String.format("✅ Pedido: %s\n💰 Total: R$ %.2f", coffee.getDescription(), coffee.getCost());
    }

    @GetMapping("/all")
    public List<String> getOrders() {
        return coffeeOrderSystem.getOrders()
                .stream()
                .map(order -> String.format("Descrição: %s | Preço: R$ %.2f", order.getDescription(), order.getPrice()))
                .collect(Collectors.toList());
    }
}
