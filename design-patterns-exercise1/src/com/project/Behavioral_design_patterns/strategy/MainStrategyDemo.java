package com.project.Behavioral_design_patterns.strategy;

import java.util.Scanner;

public class MainStrategyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String user = sc.nextLine();

        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();

        boolean continuePayment = true;
        while (continuePayment) {
            System.out.println("\nChoose Payment Method:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. UPI");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            PaymentStrategy strategy;
            switch (choice) {
                case 1 -> strategy = new CreditCardPayment();
                case 2 -> strategy = new PayPalPayment();
                case 3 -> strategy = new UpiPayment();
                case 4 -> { continuePayment = false; continue; }
                default -> { System.out.println("Invalid choice!"); continue; }
            }

            boolean success = strategy.pay(amount, user);
            if (!success) {
                System.out.println("Payment failed! Retry? (y/n)");
                sc.nextLine();
                String retry = sc.nextLine();
                if (!retry.equalsIgnoreCase("y")) continuePayment = false;
            } else {
                System.out.println("Payment completed successfully!");
            }
        }

        sc.close();
        System.out.println("Thank you for using the payment system.");
    }
}
