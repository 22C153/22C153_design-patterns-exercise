package com.project.Structural_design_patterns.bridge;

/**
 * Device interface — defines operations that all concrete devices must implement.
 */
public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    int getVolume();
    boolean isEnabled();
}
