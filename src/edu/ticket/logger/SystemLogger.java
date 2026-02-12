package edu.ticket.logger;

import java.time.LocalDateTime;

public class SystemLogger {

    private static SystemLogger instance;

    private SystemLogger() {
    }

    public static SystemLogger getInstance() {
        if (instance == null) {
            instance = new SystemLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(
            "[LOG - " + LocalDateTime.now() + "] " + message
        );
    }
}
