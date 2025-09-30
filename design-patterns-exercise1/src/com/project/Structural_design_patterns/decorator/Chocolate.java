package com.project.Structural_design_patterns.decorator;

// Adds Chocolate to a Coffee
public class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Chocolate"; // Adds Chocolate description
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.7; // Adds Chocolate cost
    }
}
