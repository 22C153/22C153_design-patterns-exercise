package com.project.Behavioral_design_patterns.strategy;

public interface PaymentStrategy {
    boolean pay(double amount, String user);
}
