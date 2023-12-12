/*
 * Write a Java program to create a simple Body Mass Index (BMI) calculator. The program should repeatedly prompt the user to enter their age, gender, height (in meters), and mass (in kilograms). For each input, calculate the BMI using the formula:
BMI= mass/(height^2) 
The program should then display the calculated BMI along with a message indicating the BMI category according to the following scale:

BMI less than 18.5: Underweight
BMI between 18.5 and 24.9: Normal weight
BMI between 25 and 29.9: Overweight
BMI of 30 or greater: Obesity

After processing each set of inputs, ask the user if they want to calculate the BMI for another person. If the user enters 'no' or 'n', exit the loop. If the user enters 'yes' or 'y', continue the loop for the next person.
Ensure that the program handles input validation appropriately (e.g., ensuring that age, height, and mass are positive numbers).
 */


package ichatcode; // user defined package 

import java.util.Scanner;// inbuilt package

public class BmiCalculator {// class declaration

	public static void main(String[] args) {// main method

		// scanner class to take input from keyboard
		Scanner scanner = new Scanner(System.in);
		// data members declaration
		int age ;
		char gender;
		double height, mass, bmi;

		// Accept Age from user 
		System.out.println("Enter your Age : ");
		age = scanner.nextInt();

		// Accept Gender from user 
		System.out.println("Enter your Gender(M/F) :  ");
		gender = getGender(scanner);
		
		// Accept Height from user 
		System.out.println("Enter your Height in meters : ");
		height = scanner.nextDouble();

		// Accept Mass from user 
		System.out.println("Enter your Mass : ");
		mass = scanner.nextDouble();

		// Calculate the BMI 
		//BMI= mass/(height^2) 
		bmi = mass /(height*height);

		// Display BMI to the user
		System.out.println("Your BMI : " + bmi);

		// display the calculated BMI along with a message indicating the BMI category
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Normal weight");
		} else if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obesity");
		}
		
		// Checking whether user want to continue the execution
		System.out.println("Do you want to calculate BMI for another person? (yes/no)");
		while (scanner.next().equalsIgnoreCase("yes"));

		// if not display messege
        System.out.println("Thank you!");
        scanner.close();
	}
	// Method to check the Gender
	private static char getGender(Scanner scanner) {
        char gender;
        do {
        	// while loop to to check 
            while (!scanner.hasNext()) {
                System.out.println("Invalid input. Please enter 'M' or 'F'.");
                scanner.next(); // Consume the invalid input
            }
            // checking the each character
            gender = scanner.next().charAt(0);
            if (gender != 'M' && gender != 'F') {
                System.out.println("Invalid input. Please enter 'M' or 'F'.");
            }
        } while (gender != 'M' && gender != 'F');
        return gender;
    }

}
/*
 * 1. use the comments
 * 2. use swich case insted of using if else
 * 3. give proper names
 */



