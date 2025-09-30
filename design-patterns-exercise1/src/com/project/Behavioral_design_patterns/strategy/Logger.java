package com.project.Behavioral_design_patterns.strategy;

import java.time.LocalDateTime;

// Simple logger to log payment attempts
public class Logger {
    public static void log(String message) {
        System.out.println(LocalDateTime.now() + " - " + message);
    }
}
