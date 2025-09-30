package com.project.Structural_design_patterns.bridge;

public class TV implements Device {
    private boolean on = false;
    private int volume = 10;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume);
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public boolean isEnabled() {
        return on;
    }
}
