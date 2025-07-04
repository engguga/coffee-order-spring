package com.starbuzz.decorator;

public class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Café simples";
    }

    public double getCost() {
        return 5.0;
    }
}
