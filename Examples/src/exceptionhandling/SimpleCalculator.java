package exceptionhandling;

import java.util.Scanner;

public class SimpleCalculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            // Prompt the user for input
	            System.out.print("Enter the first number: ");
	            double num1 = scanner.nextDouble();

	            System.out.print("Enter the second number: ");
	            double num2 = scanner.nextDouble();

	            System.out.print("Enter the operator (+, -, *, /): ");
	            char operator = scanner.next().charAt(0);

	            // Perform calculation based on the operator
	            double result;
	            switch (operator) {
	                case '+':
	                    result = num1 + num2;
	                    break;
	                case '-':
	                    result = num1 - num2;
	                    break;
	                case '*':
	                    result = num1 * num2;
	                    break;
	                case '/':
	                    if (num2 != 0) {
	                        result = num1 / num2;
	                    } else {
	                        System.out.println("Error: Division by zero is not allowed.");
	                        return;
	                    }
	                    break;
	                default:
	                    System.out.println("Error: Invalid operator input.");
	                    return;
	            }

	            // Display the result
	            System.out.println("Result: " + result);

	        } catch (Exception e) {
	            System.out.println("Error: Invalid input. Please enter valid numbers and operator.");
	        } 
	        
	    }
	}
