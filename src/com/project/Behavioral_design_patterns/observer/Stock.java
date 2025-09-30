package com.project.Behavioral_design_patterns.observer;

import java.util.*;

// Subject class — maintains list of subscribers and notifies them on price change
public class Stock {
    private String name;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Add subscriber
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println("Subscriber added.");
    }

    // Remove subscriber
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println("Subscriber removed.");
    }

    // Update stock price and notify all subscribers
    public void setPrice(double price) {
        this.price = price;
        notifySubscribers();
    }

    // Notify all observers
    private void notifySubscribers() {
        for (Observer o : observers) {
            o.update(name, price);
        }
    }
}