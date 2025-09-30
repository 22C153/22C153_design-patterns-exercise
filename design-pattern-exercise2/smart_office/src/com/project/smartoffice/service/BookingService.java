package com.project.smartoffice.service;

import com.project.smartoffice.model.Booking;
import com.project.smartoffice.repository.BookingRepository;

public class BookingService {
    private BookingRepository repository = BookingRepository.getInstance();

    public void bookRoom(Booking booking) throws Exception {
        repository.addBooking(booking);
    }

    public void cancelBooking(int roomId) throws Exception {
        repository.removeBooking(roomId);
    }

    // Added for status command
    public Booking getBookingForRoom(int roomId) {
        return repository.getBookingByRoomId(roomId);
    }
}
