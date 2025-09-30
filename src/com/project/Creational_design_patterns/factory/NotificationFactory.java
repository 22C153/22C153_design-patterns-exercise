package com.project.Creational_design_patterns.factory;

/**
 * Factory class to create Notification objects
 * Decides which type of Notification to return based on input
 */
public class NotificationFactory {
    public static Notification createNotification(String type) {
        switch(type.toUpperCase()) {
            case "EMAIL": return new EmailNotification();
            case "SMS": return new SMSNotification();
            case "PUSH": return new PushNotification();
            default: throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
