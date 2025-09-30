package com.project.Structural_design_patterns.decorator;

// Base abstract decorator that implements Coffee
public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;   // Reference to decorated Coffee object

    public CoffeeDecorator(Coffee coffee) { this.decoratedCoffee = coffee; }
    public String getDescription() { 
        return decoratedCoffee.getDescription(); // Delegates to decorated Coffee
     }
    public double getCost() {
         return decoratedCoffee.getCost(); // Delegates to decorated Coffee
        }
}
