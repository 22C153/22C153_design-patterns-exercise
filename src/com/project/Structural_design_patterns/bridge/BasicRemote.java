package com.project.Structural_design_patterns.bridge;

public class BasicRemote extends Remote {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void power() {
        if (device.isEnabled()) device.turnOff();
        else device.turnOn();
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }
}
