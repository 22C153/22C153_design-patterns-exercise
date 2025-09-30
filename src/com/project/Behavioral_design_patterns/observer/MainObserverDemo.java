package com.project.Behavioral_design_patterns.observer;

import java.util.Scanner;

// Main class to run Observer demo interactively
public class MainObserverDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stock apple = new Stock("Apple", 150.0);

        while (true) {
            System.out.println("\n1. Add Subscriber\n2. Remove Subscriber\n3. Update Stock Price\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter subscriber name: ");
                    String name = sc.nextLine();
                    apple.subscribe(new User(name));
                }
                case 2 -> {
                    System.out.print("Enter subscriber name to remove: ");
                    String name = sc.nextLine();
                    apple.unsubscribe(new User(name));
                }
                case 3 -> {
                    System.out.print("Enter new stock price: ");
                    double price = sc.nextDouble();
                    apple.setPrice(price);
                }
                case 4 -> {
                    System.out.println("Exiting program.");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
