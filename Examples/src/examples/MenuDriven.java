package examples;

import java.util.*;

public class MenuDriven {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		while(true)
		{
		
		System.out.println("\n1. Odd/Even");
		System.out.println("2.Swap variable values");
		System.out.println("3. Number divisible by 5 and 7");
		System.out.println("4. Postive/ Negetive/Zero");
		System.out.println("5. Exit");
		
		System.out.println("\n Enter your choice 1 to 5");
		int choice = obj.nextInt();
		
		switch(choice) {
		case 1:
		{
			int number;
			System.out.println("\n Enter your number to find Odd or Even");
			number = obj.nextInt();
			
			if (number % 2 == 0)
				System.out.println("Even Number");
			else
				System.out.println("Odd Number");
			break;
		}
		case 2:
		{
			int a,b;
			System.out.println("Enter 1st numbers to be swapped: ");
			a = obj.nextInt();
			
			System.out.println("Enter 2st numbers to be swapped: ");
			b = obj.nextInt();
			 int temp = a;
		        a = b;
		        b = temp;

		        // Display the swapped values
		   System.out.println("Swapped values: a = " + a + ", b = " + b);
		   break;
		}
		case 3:
		{
			int number ;
			System.out.println("\n Enter your number ");
			number = obj.nextInt();
			if (number % 5 == 0 && number % 7 == 0)
				System.out.println("Number is Divisible by 5 and 7");
			
			else 
				System.out.println("Number is not divisible by 5 and 7");
			break;
		}
		
		case 4:
		{
			System.out.println("Enter a number to check it is positive or negative or Zero");
			int num=obj.nextInt();

			if(num>0)
			System.out.println("Given number is positive");
			else if(num<0)
			System.out.println("Given munber is Negative");
			else
			System.out.println("Given Number is zero");

			break;
		}
		case 5:
		{
			System.out.println("End of program...");
			System.exit(0); //exit from the execution
		}
		default:
		{
			System.out.println("Invalid choice!!!\nEnter the choice between 1 to 4");
		}

			
		}
		}
	}

}
