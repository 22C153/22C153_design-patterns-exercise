package com.project.Structural_design_patterns.bridge;

// Abstraction
public abstract class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public abstract void power();
    public abstract void volumeUp();
    public abstract void volumeDown();
}
