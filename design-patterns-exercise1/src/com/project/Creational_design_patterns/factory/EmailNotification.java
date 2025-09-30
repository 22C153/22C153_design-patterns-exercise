package com.project.Creational_design_patterns.factory;

/**
 * Concrete implementation of Notification
 * Sends an Email notification
 */
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
