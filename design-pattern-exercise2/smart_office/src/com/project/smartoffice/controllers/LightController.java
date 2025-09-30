package com.project.smartoffice.controllers;

import com.project.smartoffice.model.Room;
import com.project.smartoffice.model.RoomObserver;
import com.project.smartoffice.util.AppLogger;

public class LightController implements RoomObserver {
    @Override
    public void update(Room room) {
        String status = room.isOccupied() ? "ON" : "OFF";
        AppLogger.log("Lights for Room-" + room.getId() + " turned " + status);
    }
}
