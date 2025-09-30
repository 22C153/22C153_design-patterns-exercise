package com.project.smartoffice.commands;

import com.project.smartoffice.core.OfficeManager;
import com.project.smartoffice.model.Room;

public class OccupantCommand implements Command {
    private OfficeManager manager;
    private int roomId;
    private int count;

    public OccupantCommand(OfficeManager manager, int roomId, int count) {
        this.manager = manager;
        this.roomId = roomId;
        this.count = count;
    }

    @Override
    public void execute() {
        Room room = manager.getRoomById(roomId);
        if(room == null) {
            System.out.println("Room not found");
            return;
        }
        if(count >= 2) {
            room.setOccupied(true);
            System.out.println("Room " + roomId + " now occupied. AC and lights turned ON.");
        } else {
            room.setOccupied(false);
            System.out.println("Room " + roomId + " now unoccupied. AC and lights turned OFF.");
        }
    }
}
