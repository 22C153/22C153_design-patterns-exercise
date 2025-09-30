package com.project.Creational_design_patterns.factory;

/**
 * Concrete implementation of Notification
 * Sends a Push notification
 */
public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Push notification sent: " + message);
    }
}
