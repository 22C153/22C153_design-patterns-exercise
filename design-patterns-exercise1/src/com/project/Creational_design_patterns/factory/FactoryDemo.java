package com.project.Creational_design_patterns.factory;

/**
 * Demo class to test the Factory Pattern
 */
public class FactoryDemo {
    public static void main(String[] args) {
        // Create an Email notification using the Factory
        Notification email = NotificationFactory.createNotification("EMAIL");
        email.send("Welcome to our service!");

        // Create an SMS notification using the Factory
        Notification sms = NotificationFactory.createNotification("SMS");
        sms.send("Your OTP is 123456");

        // Create a Push notification using the Factory
        Notification push = NotificationFactory.createNotification("PUSH");
        push.send("You have a new message");
    }
}
