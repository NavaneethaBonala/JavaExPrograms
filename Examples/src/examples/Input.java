package examples;

import java.util.Scanner;

public class Input 
{
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		
		// input to accept the integer value
		System.out.print("Enter an integer: ");
		int num = scanner.nextInt();
		System.out.println("You entered: " + num);
		
		// input to accept the double value
		System.out.print("Enter a double-point number: ");
		double num1 = scanner.nextDouble();
		System.out.println("You entered: " + num1);
		
		// input to accept the float value
		System.out.print("Enter a float-point number: ");
		float num3 = scanner.nextFloat();
		System.out.println("You entered: " + num3);
				
		// input to accept the string value
		System.out.print("Enter your name: ");
		String name = scanner.next();
		System.out.println("Hello, " + name + "!");

		System.out.print("Enter five integers separated by spaces: ");
		for (int i = 0; i < 5; i++) {
		int num2 = scanner.nextInt();
		System.out.println("You entered: " + num2);
		}

		//scanner.close();
	}
}