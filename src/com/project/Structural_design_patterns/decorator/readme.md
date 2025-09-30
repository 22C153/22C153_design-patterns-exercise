# Decorator Pattern – Dynamic Coffee Customization

# Description

Implements the Decorator Pattern in Java. Users can dynamically add toppings (Milk, Sugar, Chocolate) to a coffee base (Espresso or Latte). This pattern allows extending functionality without modifying the original class.

# Classes

Coffee.java – Interface for all coffee types.

Espresso.java / Latte.java – Concrete coffee components.

CoffeeDecorator.java – Abstract decorator class.

Milk.java / Sugar.java / Chocolate.java – Concrete decorators adding extra features.

MainDecoratorDemo.java – Runs the interactive demo.

Project Structure
design-patterns-exercise/
│── src/
│   └── com/
│       └── project/
│           └── Structural_design_patterns/
│               └── decorator/
│                   ├── Coffee.java
│                   ├── Espresso.java
│                   ├── Latte.java
│                   ├── CoffeeDecorator.java
│                   ├── Milk.java
│                   ├── Sugar.java
│                   ├── Chocolate.java
│                   └── MainDecoratorDemo.java
│
│── bin/

# How It Works

User selects a base coffee.

User can add multiple toppings dynamically.

Each decorator wraps the coffee object and adds cost and description.

Demonstrates dynamic behavior extension and open/closed principle.

# Example Output
Choose coffee base:
1. Espresso
2. Latte
Enter choice: 1

Add topping:
1. Milk
2. Sugar
3. Chocolate
4. Done
1
Add topping:
1. Milk
2. Sugar
3. Chocolate
4. Done
3
Add topping:
1. Milk
2. Sugar
3. Chocolate
4. Done
4

Your coffee: Espresso, Milk, Chocolate
Total cost: $3.2

# Compile & Run
# Compile
javac -d ../../../../bin *.java

# Run
java -cp ../../../../bin com.project.Structural_design_patterns.decorator.MainDecoratorDemo