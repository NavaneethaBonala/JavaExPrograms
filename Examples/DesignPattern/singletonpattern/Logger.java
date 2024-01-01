package singletonpattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Logger class using Singleton Pattern
class Logger {
    private static Logger instance = null;
    private PrintWriter writer;

    // Private constructor to prevent direct instantiation
    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter("log.txt", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 // Method to get the instance of Logger (Singleton)
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log message method
    public void logMessage(String message) {
        writer.println(message);
    }

    // Close method to close the writer
    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}