package string;

public class ColorOutPutExample {
    // ANSI color codes
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        // Input text
        String inputText = "Hello, World!";
        // Output text
        String outputText = "This is colored output example.";

        // Print input text in red color
        System.out.print(ANSI_PURPLE);
        System.out.println("Input: " + inputText);
        //System.out.print(ANSI_RESET); // Reset color

        // Print output text in green color
        System.out.print(ANSI_BLUE);
        System.out.println("Output: " + outputText);
        System.out.print(ANSI_RESET); // Reset color
    }
}