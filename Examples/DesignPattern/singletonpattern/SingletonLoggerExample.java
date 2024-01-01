package singletonpattern;

//Main class to demonstrate usage of the Logger class
public class SingletonLoggerExample {
 public static void main(String[] args) {
     // Get instance of the Logger
     Logger logger = Logger.getInstance();

     // Log messages from different parts of the application
     logger.logMessage("Logging message 1...");
     logger.logMessage("Logging message 2...");
     logger.logMessage("Logging message 3...");

     // Close the logger when done
     logger.close();
 }
}