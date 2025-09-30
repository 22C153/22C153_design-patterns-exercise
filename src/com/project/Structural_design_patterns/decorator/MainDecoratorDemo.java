package com.project.Structural_design_patterns.decorator;

import java.util.Scanner;

public class MainDecoratorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coffee coffee = null;

        // Step 1: Choose base coffee
        while (coffee == null) {
            System.out.println("Choose coffee base:\n1. Espresso\n2. Latte");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> coffee = new Espresso();
                case 2 -> coffee = new Latte();
                default -> System.out.println("Invalid choice! Try again.");
            }
        }

        // Step 2: Dynamically add toppings
        boolean addingToppings = true;
        while (addingToppings) {
            System.out.println("Add topping:\n1. Milk\n2. Sugar\n3. Chocolate\n4. Done");
            System.out.print("Enter choice: ");
            int toppingChoice = sc.nextInt();
            switch (toppingChoice) {
                case 1 -> coffee = new Milk(coffee);
                case 2 -> coffee = new Sugar(coffee);
                case 3 -> coffee = new Chocolate(coffee);
                case 4 -> addingToppings = false;
                default -> System.out.println("Invalid choice! Try again.");
            }
        }

        // Step 3: Print final coffee description and cost
        System.out.println("\nYour coffee: " + coffee.getDescription());
        System.out.println("Total cost: $" + coffee.getCost());

        sc.close();
    }
}
