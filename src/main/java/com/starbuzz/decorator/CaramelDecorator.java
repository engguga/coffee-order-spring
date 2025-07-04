package com.starbuzz.decorator;

public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", caramelo";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }
}
