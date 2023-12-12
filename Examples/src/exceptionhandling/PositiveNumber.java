package exceptionhandling;

import java.util.Scanner;

public class PositiveNumber {
	
public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		try {
			//monitor the codes for error
			System.out.println("Enter an integer");
			int a = obj.nextInt();
			if(a>0)
				System.out.println("+ve number");
			else
				System.out.println("-ve number");
			
			
		}
		catch(Exception e)
		{
			//receive the information from try block when error occurs
			System.out.println("Warning!!! *Enter valid integer values*");
			
		}
		finally
		{
			//regardless of the error occurences , code will run
			//close the resources
			obj.close();
			System.out.println("scanner object closed");
			
		}

	}


}
