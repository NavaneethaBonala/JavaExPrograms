package exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class FinallyExample {
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("example.txt");
            // Code that may throw an IOException
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            // Close the FileReader, regardless of whether an exception occurred or not
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
