package com.project.Creational_design_patterns.singleton;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Singleton Logger class
 * Ensures only one instance of Logger exists in the application
 * and provides a global point of access for logging messages.
 */
public class Logger {
    // Volatile ensures changes are visible across threads
    private static volatile Logger instance;

    // Log file name
    private static final String LOG_FILE = "app.log";

    // Private constructor prevents instantiation from outside
    private Logger() {}

    /**
     * Public method to get the single instance of Logger
     * Uses Double-Checked Locking for thread safety
     */
    public static Logger getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized(Logger.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    /**
     * Logs a message with a given log level (INFO, DEBUG, ERROR, etc.)
     * Message is printed to console and written into a file.
     */
    public void log(String level, String message) {
        String logMessage = LocalDateTime.now() + " [" + level + "] " + message;

        // Print to console
        System.out.println(logMessage);

        // Append log message into a file
        try (FileWriter fw = new FileWriter(LOG_FILE, true)) {
            fw.write(logMessage + "\n");
        } catch (IOException e) {
            System.err.println("Logging failed: " + e.getMessage());
        }
    }
}
