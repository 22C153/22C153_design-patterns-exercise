# Observer Pattern – Stock Price Alert System

## Description
Implements the **Observer Pattern** in Java. Users subscribe to stock updates and receive notifications whenever the stock price changes.

## Classes
- `Observer.java` – Interface for all subscribers.
- `User.java` – Concrete observer receiving notifications.
- `Stock.java` – Subject maintaining stock price and notifying observers.
- `MainObserverDemo.java` – Runs the interactive demo.

## project structure
design-patterns-exercise/
│── src/
│   └── com/
│       └── project/
│           └── Behavioral_design_patterns/
│               ├── observer/
│               │   ├── Observer.java
│               │   ├── Stock.java
│               │   ├── User.java
│               │   └── MainObserverDemo.java
│               └── strategy/
│                   ├── PaymentStrategy.java
│                   ├── CreditCardPayment.java
│                   ├── PayPalPayment.java
│                   ├── UpiPayment.java
│                   └── MainStrategyDemo.java
│
│── bin/


## How It Works
- Users can subscribe/unsubscribe to stock updates.
- Whenever stock price changes, all subscribed users are notified automatically.
- Demonstrates **loose coupling** between Subject and Observers.

## Example Output
1. Add Subscriber
2. Remove Subscriber
3. Update Stock Price
4. Exit
Enter choice: 1
Enter subscriber name: Alice
Subscriber added.

1. Add Subscriber
2. Remove Subscriber
3. Update Stock Price
4. Exit
Enter choice: 1
Enter subscriber name: Bob
Subscriber added.

1. Add Subscriber
2. Remove Subscriber
3. Update Stock Price
4. Exit
Enter choice: 3
Enter new stock price: 160
Notification for Alice: Apple price changed to $160.0
Notification for Bob: Apple price changed to $160.0

1. Add Subscriber
2. Remove Subscriber
3. Update Stock Price
4. Exit
Enter choice: 2
Enter subscriber name to remove: Alice
Subscriber removed.

1. Add Subscriber
2. Remove Subscriber
3. Update Stock Price
4. Exit
Enter choice: 3
Enter new stock price: 170
Notification for Bob: Apple price changed to $170.0

1. Add Subscriber
2. Remove Subscriber
3. Update Stock Price
4. Exit
Enter choice: 4
Exiting program.


## Compile & Run
```bash
# Compile
javac -d ../../../../bin *.java

# Run
java -cp ../../../../bin com.project.Behavioral_design_patterns.observer.MainObserverDemo
