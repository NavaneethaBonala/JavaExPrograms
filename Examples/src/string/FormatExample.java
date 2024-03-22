package string;

public class FormatExample {
    public static void main(String[] args) {
    	
        String name = "Johnson";
        int age = 28;
        double salary = 50000.75;
        
        String name1 = "John";
        String name2 = "Alice";
        int age1 = 30;
        int age2 = 25;

        // String and integer formatting
        System.out.printf("Name: %s, Age: %d%n", name, age);

        // Floating-point number formatting with precision
        System.out.printf("Salary: $%,.2f%n", salary);

        // Padding with zeros for an integer
        int zipCode = 123;
        System.out.printf("Zip Code: %05d%n", zipCode);
        
        // Default formatting
        System.out.println("\nDefault formatting:");
     // here % is indicate that format specifiers are applied
		//here '-' is left allignment
		// 10 is the character spacing between columns(we can change the number according to he user interest)
		// %n is the new line
        System.out.printf("%-10s %-5s%n", "Name", "Age");
        System.out.printf("%-10s %-5d%n", name1, age1);
        System.out.printf("%-10s %-5d%n", name2, age2);

        // Adjusted spacing
        System.out.println("\nAdjusted spacing:");
        System.out.printf("%-15s %-8s%n", "Name", "Age");
        System.out.printf("%-15s %-8d%n", name1, age1);
        System.out.printf("%-15s %-8d%n", name2, age2);
    }
}

