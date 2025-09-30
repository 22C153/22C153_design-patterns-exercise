package com.project.Behavioral_design_patterns.strategy;

import java.util.Random;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount, String user) {
        System.out.println(user + " attempting Credit Card payment of $" + amount);
        boolean success = new Random().nextBoolean();
        System.out.println(success ? "Credit Card payment successful." : "Credit Card payment failed! Retry.");
        return success;
    }
}
