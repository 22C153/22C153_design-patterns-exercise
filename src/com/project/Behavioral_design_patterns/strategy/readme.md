

## 2️⃣ Strategy Pattern – README.md  

**File location:** `src/com/project/Behavioral_design_patterns/strategy/README.md`

```markdown
# Strategy Pattern – Payment Gateway System

## Description
Implements the **Strategy Pattern** in Java. Users can select different payment methods at runtime.

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

## Classes
- `PaymentStrategy.java` – Interface defining `pay()` method.
- `CreditCardPayment.java` – Concrete strategy for credit card.
- `PayPalPayment.java` – Concrete strategy for PayPal.
- `UpiPayment.java` – Concrete strategy for UPI.
- `MainStrategyDemo.java` – Runs interactive payment selection.

## How It Works
- User enters amount to pay and selects a payment method.
- Strategy pattern allows **dynamic selection** of payment behavior at runtime.
- Supports **easy extension** for new payment methods.

## Example Output

1. Credit Card
2. PayPal
3. UPI
4. Exit
Enter choice: 1
janani attempting Credit Card payment of $500.0
Credit Card payment failed! Retry.
Payment failed! Retry? (y/n)
3
Thank you for using the payment system.
PS E:\EI_22c153\design-patterns-exercise1\src> java -cp ../bin com.project.Behavioral_design_patterns.strategy.MainStrategyDemo
>>
Enter your name: janani
Enter amount to pay: 1

Choose Payment Method:
1. Credit Card
2. PayPal
3. UPI
4. Exit
Enter choice: 1
janani attempting Credit Card payment of $1.0
Credit Card payment successful.
Payment completed successfully!

Choose Payment Method:
1. Credit Card
2. PayPal
3. UPI
4. Exit
Enter choice: 2
janani attempting PayPal payment of $1.0
PayPal payment successful.
Payment completed successfully!

Choose Payment Method:
1. Credit Card
2. PayPal
3. UPI
4. Exit
Enter choice: 3
janani attempting UPI payment of $1.0
UPI payment failed! Retry.
Payment failed! Retry? (y/n)
y

Choose Payment Method:
1. Credit Card
2. PayPal
3. UPI
4. Exit
Enter choice: 3
janani attempting UPI payment of $1.0
UPI payment failed! Retry.
Payment failed! Retry? (y/n)
y

Choose Payment Method:
1. Credit Card
2. PayPal
3. UPI
4. Exit
Enter choice: 1
janani attempting Credit Card payment of $1.0
Credit Card payment failed! Retry.
Payment failed! Retry? (y/n)
y

Choose Payment Method:
1. Credit Card
2. PayPal
3. UPI
4. Exit
Enter choice: 2
janani attempting PayPal payment of $1.0
PayPal payment successful.
Payment completed successfully!

Choose Payment Method:
1. Credit Card
2. PayPal
3. UPI
4. Exit
Enter choice: 4
Thank you for using the payment system.


## Compile & Run
```bash
# Compile
javac -d ../../../../bin *.java

# Run
java -cp ../../../../bin com.project.Behavioral_design_patterns.strategy.MainStrategyDemo

