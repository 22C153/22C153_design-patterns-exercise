# Smart Office Console Application

## Overview
Smart Office is a console-based Java application to manage a smart office facility. It allows users to:

- Configure meeting rooms
- Set room capacities
- Book and cancel conference rooms
- Track room occupancy using sensors
- Automatically control AC and lights based on occupancy
- View room status and booking details

The application demonstrates the use of design patterns:

- **Singleton Pattern**: For `OfficeManager` to maintain a single global office state.
- **Observer Pattern**: AC and lighting systems subscribe to room occupancy changes.
- **Command Pattern**: Commands for booking, cancellation, and occupant updates.

---

## Project Structure

smart-office/
├─ src/main/java/com/project/smartoffice/
│ ├─ Main.java
│ ├─ controller/ConsoleController.java
│ ├─ core/OfficeManager.java
│ ├─ model/Room.java
│ ├─ model/Booking.java
│ ├─ model/RoomObserver.java
│ ├─ service/BookingService.java
│ ├─ commands/Command.java
│ ├─ commands/BookRoomCommand.java
│ ├─ commands/CancelRoomCommand.java
│ ├─ commands/OccupantCommand.java
│ ├─ controllers/ACController.java
│ ├─ controllers/LightController.java
│ ├─ repository/BookingRepository.java
│ ├─ scheduler/SchedulerService.java
│ ├─ util/AppLogger.java
│ └─ exceptions/*.java
├─ pom.xml
└─ README.md



---

## How to Build & Run

1. **Build using Maven**

```bash
mvn clean package

## Run the application

java -jar target/smart-office-1.0-SNAPSHOT.jar

# Example Commands

config rooms 3
setcapacity 1 10
add occupant 1 2
book 1 09:00 60
status 1
cancel 1
remove occupant 1 1
exit

# Sample Output


Smart Office Console Started
Type 'exit' to quit.
> config rooms 3
Office configured with 3 meeting rooms.
> setcapacity 1 10
Room 1 capacity set to 10
> add occupant 1 2
Room 1 now occupied. AC and lights turned ON.
> book 1 09:00 60
Room 1 booked from 09:00 for 60 minutes.
> status 1
Room 1 Status:
  Occupied: true
  Capacity: 10
  Booking: 09:00 for 60 mins
  AC: ON
  Lights: ON
> cancel 1
Booking for Room 1 cancelled successfully.
> exit
Console closed.

# Notes

Make sure Java 17 or higher is installed.

Optional: Integrate email/SMS notifications for auto-released bookings.

Designed for scalability and maintainability using design patterns.