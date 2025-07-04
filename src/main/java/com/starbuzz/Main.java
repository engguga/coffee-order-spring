package com.starbuzz;

import com.starbuzz.builder.CoffeeBuilder;
import com.starbuzz.singleton.CoffeeOrderSystem;
import com.starbuzz.decorator.Coffee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("com.starbuzz");
        CoffeeOrderSystem coffeeOrderSystem = context.getBean(CoffeeOrderSystem.class);

        Coffee coffee = new CoffeeBuilder()
                .withMilk()
                .withWhippedCream()
                .withChocolate()
                .build();

        coffeeOrderSystem.placeOrder(coffee);
    }
}
