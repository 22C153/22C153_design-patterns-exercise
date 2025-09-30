# Bridge Pattern – Remote Control for Devices

# Description

Implements the Bridge Pattern in Java. Users can control devices (TV, Radio) using different remotes (Basic, Advanced). This pattern decouples abstraction (Remote) from implementation (Device), allowing runtime flexibility.

# Classes

Device.java – Interface for all devices.

TV.java / Radio.java – Concrete device implementations.

Remote.java – Abstract remote class.

BasicRemote.java / AdvancedRemote.java – Concrete remotes extending abstraction.

MainBridgeDemo.java – Runs the interactive demo.

# Project Structure

design-patterns-exercise/
│── src/
│   └── com/
│       └── project/
│           └── Structural_design_patterns/
│               └── bridge/
│                   ├── Device.java
│                   ├── TV.java
│                   ├── Radio.java
│                   ├── Remote.java
│                   ├── BasicRemote.java
│                   ├── AdvancedRemote.java
│                   └── MainBridgeDemo.java
│
│── bin/

# How It Works

User selects a device (TV or Radio) and a remote (Basic or Advanced).

BasicRemote performs standard power and volume operations.

AdvancedRemote can also mute the device.

Demonstrates decoupling abstraction from implementation and runtime flexibility.

# Example Output
Choose device:
1. TV
2. Radio
1
Choose remote:
1. Basic
2. Advanced
2

1. Power
2. Volume Up
3. Volume Down
4. Mute (Advanced only)
5. Exit
1
TV is ON
2
TV volume set to 15
4
Device muted
5
Exiting remote control system.

Compile & Run
# Compile
javac -d ../../../../bin *.java

# Run
java -cp ../../../../bin com.project.Structural_design_patterns.bridge.MainBridgeDemo