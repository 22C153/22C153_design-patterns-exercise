package com.project.smartoffice.repository;

import com.project.smartoffice.model.Booking;
import java.util.ArrayList;
import java.util.List;

public class BookingRepository {
    private static BookingRepository instance;
    private List<Booking> bookings = new ArrayList<>();

    private BookingRepository() {}

    public static synchronized BookingRepository getInstance() {
        if (instance == null) {
            instance = new BookingRepository();
        }
        return instance;
    }

    public void addBooking(Booking booking) throws Exception {
        for (Booking b : bookings) {
            if (b.getRoomId() == booking.getRoomId() &&
                b.getStartTime().equals(booking.getStartTime())) {
                throw new Exception("Room already booked at this time");
            }
        }
        bookings.add(booking);
    }

    public void removeBooking(int roomId) throws Exception {
        boolean removed = bookings.removeIf(b -> b.getRoomId() == roomId);
        if (!removed) {
            throw new Exception("Room " + roomId + " not booked.");
        }
    }

    public Booking getBookingByRoomId(int roomId) {
        for (Booking b : bookings) {
            if (b.getRoomId() == roomId) return b;
        }
        return null;
    }
}
