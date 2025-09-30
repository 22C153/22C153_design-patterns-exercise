package com.project.smartoffice.model;

import java.time.LocalTime;

public class Booking {
    private int roomId;
    private LocalTime startTime;
    private int durationMinutes;

    public Booking(int roomId, LocalTime startTime, int durationMinutes) {
        this.roomId = roomId;
        this.startTime = startTime;
        this.durationMinutes = durationMinutes;
    }

    public int getRoomId() { return roomId; }
    public LocalTime getStartTime() { return startTime; }
    public int getDurationMinutes() { return durationMinutes; }
}
