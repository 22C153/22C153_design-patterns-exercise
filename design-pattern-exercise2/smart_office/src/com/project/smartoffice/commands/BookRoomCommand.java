package com.project.smartoffice.commands;

import com.project.smartoffice.model.Booking;
import com.project.smartoffice.service.BookingService;

public class BookRoomCommand implements Command {
    private BookingService service;
    private Booking booking;

    public BookRoomCommand(BookingService service, Booking booking) {
        this.service = service;
        this.booking = booking;
    }

    @Override
    public void execute() {
        try {
            service.bookRoom(booking);
            // Feedback to user after successful booking
            System.out.println("Room " + booking.getRoomId() + " booked from "
                    + booking.getStartTime() + " for " + booking.getDurationMinutes() + " mins.");
        } catch (Exception e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}
