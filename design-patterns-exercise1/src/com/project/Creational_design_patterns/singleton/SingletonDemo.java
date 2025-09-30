package com.project.Creational_design_patterns.singleton;

/**
 * Demo class to test the Singleton Logger
 */
public class SingletonDemo {
    public static void main(String[] args) {
        // Access the single Logger instance
        Logger logger = Logger.getInstance();

        // Log different messages
        logger.log("INFO", "Application started");
        logger.log("DEBUG", "Debugging application");
        logger.log("ERROR", "An error occurred");
    }
}
