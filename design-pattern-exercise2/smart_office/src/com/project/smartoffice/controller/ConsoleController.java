package com.project.smartoffice.controller;

import com.project.smartoffice.core.OfficeManager;
import com.project.smartoffice.model.Booking;
import com.project.smartoffice.model.Room;
import com.project.smartoffice.service.BookingService;
import com.project.smartoffice.commands.*;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConsoleController {
    private BookingService bookingService = new BookingService();
    private OfficeManager officeManager = OfficeManager.getInstance();
    private CommandInvoker invoker = new CommandInvoker();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Smart Office Console Started");
        System.out.println("Type 'exit' to quit.");

        boolean running = true;
        while (running) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) continue;

            String[] tokens = input.split("\\s+");

            try {
                switch (tokens[0].toLowerCase()) {
                    case "exit":
                        running = false;
                        break;

                    case "config":
                        if (tokens.length >= 3 && tokens[1].equalsIgnoreCase("rooms")) {
                            int n = Integer.parseInt(tokens[2]);
                            officeManager.configureRooms(n);
                            System.out.println("Office configured with " + n + " meeting rooms.");
                        } else {
                            System.out.println("Usage: config rooms <number>");
                        }
                        break;

                    case "setcapacity":
                        if (tokens.length >= 3) {
                            int roomId = Integer.parseInt(tokens[1]);
                            int capacity = Integer.parseInt(tokens[2]);
                            Room room = officeManager.getRoomById(roomId);
                            if (room != null) {
                                room.setCapacity(capacity);
                                System.out.println("Room " + roomId + " capacity set to " + capacity);
                            } else {
                                System.out.println("Room " + roomId + " does not exist.");
                            }
                        } else {
                            System.out.println("Usage: setcapacity <roomId> <capacity>");
                        }
                        break;

                    case "book":
                        if (tokens.length >= 4) {
                            int roomId = Integer.parseInt(tokens[1]);
                            LocalTime time = LocalTime.parse(tokens[2]);
                            int duration = Integer.parseInt(tokens[3]);
                            Booking booking = new Booking(roomId, time, duration);
                            invoker.execute(new BookRoomCommand(bookingService, booking));
                        } else {
                            System.out.println("Usage: book <roomId> <HH:MM> <duration>");
                        }
                        break;

                    case "cancel":
                        if (tokens.length >= 2) {
                            int roomId = Integer.parseInt(tokens[1]);
                            invoker.execute(new CancelRoomCommand(bookingService, roomId));
                        } else {
                            System.out.println("Usage: cancel <roomId>");
                        }
                        break;

                    case "add":
                        if (tokens.length >= 4 && tokens[1].equalsIgnoreCase("occupant")) {
                            int roomId = Integer.parseInt(tokens[2]);
                            int count = Integer.parseInt(tokens[3]);
                            invoker.execute(new OccupantCommand(officeManager, roomId, count));
                        } else {
                            System.out.println("Usage: add occupant <roomId> <count>");
                        }
                        break;

                    case "remove":
                        if (tokens.length >= 4 && tokens[1].equalsIgnoreCase("occupant")) {
                            int roomId = Integer.parseInt(tokens[2]);
                            int count = Integer.parseInt(tokens[3]);
                            invoker.execute(new OccupantCommand(officeManager, roomId, -count));
                        } else {
                            System.out.println("Usage: remove occupant <roomId> <count>");
                        }
                        break;

                    case "status":
                        if (tokens.length >= 2) {
                            int roomId = Integer.parseInt(tokens[1]);
                            Room room = officeManager.getRoomById(roomId);
                            if (room != null) {
                                System.out.println("Room " + roomId + " Status:");
                                System.out.println("  Occupied: " + room.isOccupied());
                                System.out.println("  Capacity: " + room.getCapacity());
                                Booking booking = bookingService.getBookingForRoom(roomId);
                                if (booking != null) {
                                    System.out.println("  Booking: " + booking.getStartTime() + " for " + booking.getDurationMinutes() + " mins");
                                } else {
                                    System.out.println("  Booking: None");
                                }
                                System.out.println("  AC: " + (room.isOccupied() ? "ON" : "OFF"));
                                System.out.println("  Lights: " + (room.isOccupied() ? "ON" : "OFF"));
                            } else {
                                System.out.println("Room " + roomId + " does not exist.");
                            }
                        } else {
                            System.out.println("Usage: status <roomId>");
                        }
                        break;

                    default:
                        System.out.println("Unknown command: " + input);
                }
            } catch (NumberFormatException | DateTimeParseException e) {
                System.out.println("Invalid input format: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Console closed.");
    }
}
