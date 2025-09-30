package com.project.Structural_design_patterns.decorator;

public class Latte implements Coffee {
    @Override
    public String getDescription() { return "Latte"; }
    @Override
    public double getCost() { return 3.0; }
}
