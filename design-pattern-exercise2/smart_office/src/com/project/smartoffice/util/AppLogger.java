package com.project.smartoffice.util;

import java.time.LocalDateTime;

public class AppLogger {
    public static void log(String message) {
        System.out.println("[" + LocalDateTime.now() + "] " + message);
    }
}
