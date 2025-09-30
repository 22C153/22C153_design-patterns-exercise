package com.project.smartoffice.sensors;

import com.project.smartoffice.model.Room;
import com.project.smartoffice.util.AppLogger;

// Simulated occupancy sensor
public class OccupancySensor {
    private Room room;

    public OccupancySensor(Room room) {
        this.room = room;
    }

    // Add occupants and trigger observer
    public void addOccupants(int count) {
        AppLogger.log("Adding " + count + " occupants to Room-" + room.getId());
        room.setOccupied(count > 0);
    }

    // Remove occupants
    public void removeOccupants(int count) {
        AppLogger.log("Removing " + count + " occupants from Room-" + room.getId());
        room.setOccupied(false);
    }
}
