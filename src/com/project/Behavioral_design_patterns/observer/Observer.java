package com.project.Behavioral_design_patterns.observer;

// Observer interface — implemented by any user who wants stock updates
public interface Observer {
    void update(String stockName, double price);
}
