package com.project.Structural_design_patterns.decorator;

// Adds Milk to a Coffee
public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) { 
        super(coffee);
     }
    @Override
    public String getDescription() { 
        return decoratedCoffee.getDescription() + ", Milk";  // Adds Milk description
     }
    @Override
    public double getCost() { 
        return decoratedCoffee.getCost() + 0.5;      // Adds Milk cost
     }
}
