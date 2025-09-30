package com.project.Behavioral_design_patterns.strategy;

import java.util.Random;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount, String user) {
        System.out.println(user + " attempting PayPal payment of $" + amount);
        boolean success = new Random().nextBoolean();
        System.out.println(success ? "PayPal payment successful." : "PayPal payment failed! Retry.");
        return success;
    }
}
