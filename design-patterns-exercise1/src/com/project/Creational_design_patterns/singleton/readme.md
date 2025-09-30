# Design Patterns Exercise

This project demonstrates the implementation of **Creational Design Patterns** in Java, including **Singleton** and **Factory** patterns. The project is structured for clarity, modularity, and interactive user input.

## Project Structure

design-patterns-exercise/
│── src/
│ └── com/
│ └── project/
│ └── Creational_design_patterns/
│ ├── singleton/
│ │ ├── Logger.java
│ │ └── SingletonDemo.java
│ └── factory/
│ ├── Notification.java
│ ├── EmailNotification.java
│ ├── SMSNotification.java
│ ├── PushNotification.java
│ ├── NotificationFactory.java
│ └── FactoryDemo.java
│
│── bin/



- **src/**: Contains all source code organized by design pattern and type.
- **bin/**: Compiled `.class` files after building the project.

---

## Creational Design Patterns Implemented

### 1. Singleton Pattern

**Use Case:** Logger

- Ensures that only **one instance of the Logger** exists throughout the application.
- Demonstrates **controlled access** to a shared resource.
- Classes:
  - `Logger.java`: Singleton class for logging messages.
  - `SingletonDemo.java`: Demonstrates creating and using the singleton Logger instance.

**How it works:**
- `Logger` has a private constructor.
- A static method `getInstance()` ensures only one object is created.
- Multiple calls to `getInstance()` return the same object.

**Example Output:**
Logger instance created.
Log Message 1
Log Message 2
Same Logger instance used.

## How to Compile and Run

1. Open a terminal in the `src/` directory.
2. Compile the source code:

```bash

#compile

javac -d ../bin com/project/Creational_design_patterns/singleton/*.java

# Run Singleton Demo:

java -cp ../bin com.project.Creational_design_patterns.singleton.SingletonDemo

