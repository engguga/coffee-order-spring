package com.starbuzz.decorator;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", chocolate";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.5;
    }
}
