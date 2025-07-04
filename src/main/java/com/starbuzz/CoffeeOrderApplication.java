package com.starbuzz;

import com.starbuzz.builder.CoffeeBuilder;
import com.starbuzz.singleton.CoffeeOrderSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoffeeOrderApplication implements CommandLineRunner {

    @Autowired
    private CoffeeOrderSystem coffeeOrderSystem;

    public static void main(String[] args) {
        SpringApplication.run(CoffeeOrderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var coffee = new CoffeeBuilder()
            .withMilk()
            .withWhippedCream()
            .withChocolate()
            .withCaramel()
            .build();

        coffeeOrderSystem.placeOrder(coffee);
    }
}
