package com.project.Behavioral_design_patterns.observer;

// Concrete Observer
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Notification for " + name + ": " + stockName + " price changed to $" + price);
    }

    // Override equals() and hashCode() to allow proper removal from list
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        return name.equals(((User)obj).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}