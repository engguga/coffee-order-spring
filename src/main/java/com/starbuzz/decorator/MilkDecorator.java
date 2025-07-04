package com.starbuzz.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", leite";
    }

    public double getCost() {
        return super.getCost() + 2.0;
    }
}
