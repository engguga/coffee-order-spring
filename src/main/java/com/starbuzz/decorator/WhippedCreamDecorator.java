package com.starbuzz.decorator;

public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", chantilly";
    }

    public double getCost() {
        return super.getCost() + 1.5;
    }
}
