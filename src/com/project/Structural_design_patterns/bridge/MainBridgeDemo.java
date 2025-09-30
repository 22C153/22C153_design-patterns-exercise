package com.project.Structural_design_patterns.bridge;

import java.util.Scanner;

/**
 * Main program — user selects device and remote type,package com.project.Structural_design_patterns.bridge;

import java.util.Scanner;

public class MainBridgeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Device device = null;
        Remote remote = null;

        System.out.println("Choose device:\n1. TV\n2. Radio");
        int deviceChoice = sc.nextInt();
        System.out.println("Choose remote:\n1. Basic\n2. Advanced");
        int remoteChoice = sc.nextInt();

        device = (deviceChoice == 1) ? new TV() : new Radio();
        remote = (remoteChoice == 1) ? new BasicRemote(device) : new AdvancedRemote(device);

        boolean run = true;
        while (run) {
            System.out.println("\n1. Power\n2. Volume Up\n3. Volume Down\n4. Mute (Advanced only)\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> remote.power();
                case 2 -> remote.volumeUp();
                case 3 -> remote.volumeDown();
                case 4 -> {
                    if (remote instanceof AdvancedRemote ar) ar.mute();
                    else System.out.println("Invalid option for Basic Remote!");
                }
                case 5 -> run = false;
                default -> System.out.println("Invalid choice!");
            }
        }
        sc.close();
        System.out.println("Exiting remote control system.");
    }
}
then controls device interactively.
 */
public class MainBridgeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Device device;
        Remote remote;

        // Select device
        System.out.println("Choose device:\n1. TV\n2. Radio");
        int deviceChoice = sc.nextInt();

        // Select remote
        System.out.println("Choose remote:\n1. Basic\n2. Advanced");
        int remoteChoice = sc.nextInt();

        device = (deviceChoice == 1) ? new TV() : new Radio();
        remote = (remoteChoice == 1) ? new BasicRemote(device) : new AdvancedRemote(device);

        boolean run = true;
        while (run) {
            System.out.println("\n1. Power\n2. Volume Up\n3. Volume Down\n4. Mute (Advanced only)\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> remote.power();
                case 2 -> remote.volumeUp();
                case 3 -> remote.volumeDown();
                case 4 -> {
                    if (remote instanceof AdvancedRemote ar) ar.mute();
                    else System.out.println("Invalid option for Basic Remote");
                }
                case 5 -> run = false;
                default -> System.out.println("Invalid choice!");
            }
        }
        sc.close();
        System.out.println("Exiting remote control system.");
    }
}
