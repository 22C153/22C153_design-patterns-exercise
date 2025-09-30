package com.project.smartoffice.commands;

import com.project.smartoffice.service.BookingService;

public class CancelRoomCommand implements Command {
    private BookingService service;
    private int roomId;

    public CancelRoomCommand(BookingService service, int roomId) {
        this.service = service;
        this.roomId = roomId;
    }

    @Override
    public void execute() {
        try {
            service.cancelBooking(roomId);
            System.out.println("Booking for Room " + roomId + " cancelled successfully.");
        } catch (Exception e) {
            System.out.println("Cancellation failed: " + e.getMessage());
        }
    }
}
