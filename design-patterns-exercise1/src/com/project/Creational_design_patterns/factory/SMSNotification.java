package com.project.Creational_design_patterns.factory;

/**
 * Concrete implementation of Notification
 * Sends an SMS notification
 */
public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
