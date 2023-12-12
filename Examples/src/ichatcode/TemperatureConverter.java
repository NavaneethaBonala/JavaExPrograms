package ichatcode;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Enter temperature in Celsius: ");
			while (!sc.hasNextDouble()) {
				System.out.println("Invalid input. Please enter a valid numerical value.");
				System.out.print("Enter temperature in Celsius: ");
				sc.next();
			}

			double celsius = sc.nextDouble();
			double fahrenheit = (9.0 / 5.0) * celsius + 32;

			System.out.println("Temperature in Fahrenheit: " + fahrenheit);
			displaytemperature(fahrenheit);

			System.out.print("Do you want to convert another temperature? (yes/no): ");
		} while (sc.next().equalsIgnoreCase("yes") || sc.next().equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
		sc.close();
	}

	public static void displaytemperature(double fahrenheit) {
		if (fahrenheit < 32) {
			System.out.println("Temperature category: Very cold");
		} else if (fahrenheit >= 32 && fahrenheit < 50) {
			System.out.println("Temperature category: Cold");
		} else if (fahrenheit >= 50 && fahrenheit < 70) {
			System.out.println("Temperature category: Mild");
		} else {
			System.out.println("Temperature category: Warm");
		}
	}
}

/*
 * Good job on writing the code! However, 
 * there are a few improvements you can make. 
 * First, it's a good practice to include comments in your code to explain what each section does. 
 * Second, instead of using the 'do-while' loop, you can use a 'while' loop and
 *  initialize the variable 'convertAnother' to 'true'. 
 *  Inside the loop, ask the user if they want to convert another temperature 
 *  and update the 'convertAnother' variable accordingly. 
 *  Finally, you can simplify the condition in the 'while' loop for input validation by using the 'hasNextDouble()'
 *   method directly.
 *    This way, you don't need to call 'sc.next()' twice. Make these improvements and your code will be even better!*/
