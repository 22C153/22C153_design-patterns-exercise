package com.project.Structural_design_patterns.bridge;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 5;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + volume);
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
