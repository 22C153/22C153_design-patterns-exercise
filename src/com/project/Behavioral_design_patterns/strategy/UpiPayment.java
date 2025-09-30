package com.project.Behavioral_design_patterns.strategy;

import java.util.Random;

public class UpiPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount, String user) {
        System.out.println(user + " attempting UPI payment of $" + amount);
        boolean success = new Random().nextBoolean();
        System.out.println(success ? "UPI payment successful." : "UPI payment failed! Retry.");
        return success;
    }
}
