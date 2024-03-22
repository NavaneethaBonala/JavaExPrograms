package exceptionhandling;

public class WithoutCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            // Simulating an exception
            int result = 5 / 0;
        } finally {
            // This block will be executed even if an exception occurs
            System.out.println("Inside finally block");
        }
    }
}
