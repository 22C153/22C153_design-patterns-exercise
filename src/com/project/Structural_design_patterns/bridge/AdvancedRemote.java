package com.project.Structural_design_patterns.bridge;

public class AdvancedRemote extends Remote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void power() {
        if (device.isEnabled()) device.turnOff();
        else device.turnOn();
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 5);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 5);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Device muted");
    }
}
