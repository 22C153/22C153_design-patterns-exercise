### 2. Factory Pattern

**Use Case:** Notification System

- Provides a **factory to create different types of notifications** dynamically.
- Demonstrates **runtime flexibility** in object creation.
- Classes:
  - `Notification.java`: Interface for notifications.
  - `EmailNotification.java`: Concrete notification type.
  - `SMSNotification.java`: Concrete notification type.
  - `PushNotification.java`: Concrete notification type.
  - `NotificationFactory.java`: Factory class to create notification objects.
  - `FactoryDemo.java`: Demonstrates creating and sending notifications using the factory.

**How it works:**
- The client code asks `NotificationFactory` for a notification type (Email/SMS/Push).
- Factory returns the correct implementation.
- Client calls `notifyUser()` without worrying about the concrete class.

**Example Output:**
Enter notification type (EMAIL/SMS/PUSH): EMAIL
Sending Email Notification

Email sent: Welcome to our service!
SMS sent: Your OTP is 123456
Push notification sent: You have a new message


## How to Compile and Run

1. Open a terminal in the `src/` directory.
2. Compile the source code:

```bash

#compile 

javac -d ../bin com/project/Creational_design_patterns/factory/*.java


#Run Factory Demo:

java -cp ../bin com.project.Creational_design_patterns.factory.FactoryDemo