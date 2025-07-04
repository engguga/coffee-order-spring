package com.starbuzz.builder;

import com.starbuzz.decorator.*;

public class CoffeeBuilder {
    private Coffee coffee;

    public CoffeeBuilder() {
        coffee = new SimpleCoffee();
    }

    public CoffeeBuilder withMilk() {
        coffee = new MilkDecorator(coffee);
        return this;
    }

    public CoffeeBuilder withWhippedCream() {
        coffee = new WhippedCreamDecorator(coffee);
        return this;
    }

    public CoffeeBuilder withChocolate() {
        coffee = new ChocolateDecorator(coffee);
        return this;
    }

    public CoffeeBuilder withCaramel() {
        coffee = new CaramelDecorator(coffee);
        return this;
    }

    public Coffee build() {
        return coffee;
    }
}
