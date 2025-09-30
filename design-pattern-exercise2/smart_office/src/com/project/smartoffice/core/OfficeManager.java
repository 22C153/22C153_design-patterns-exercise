package com.project.smartoffice.core;

import com.project.smartoffice.model.Room;
import com.project.smartoffice.util.AppLogger;

import java.util.ArrayList;
import java.util.List;

public class OfficeManager {
    private static OfficeManager instance;
    private List<Room> rooms = new ArrayList<>();

    private OfficeManager() {
        AppLogger.log("OfficeManager initialized.");
    }

    public static synchronized OfficeManager getInstance() {
        if(instance == null) {
            instance = new OfficeManager();
        }
        return instance;
    }

    public void configureRooms(int n) {
        rooms.clear();
        for(int i=1; i<=n; i++) {
            rooms.add(new Room(i, 10)); // default capacity 10
        }
        AppLogger.log("Configured " + n + " rooms.");
    }

    public Room getRoomById(int id) {
        return rooms.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
