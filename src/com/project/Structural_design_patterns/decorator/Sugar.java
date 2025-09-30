package com.project.Structural_design_patterns.decorator;

// Adds Sugar to a Coffee
public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) { 
        super(coffee); 
    }
    @Override
    public String getDescription() { 
        return decoratedCoffee.getDescription() + ", Sugar"; // Adds Sugar description
     }
    @Override
    public double getCost() { 
        return decoratedCoffee.getCost() + 0.2;   // Adds Sugar cost
     }
}
