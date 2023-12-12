package examples;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		
		int n, factorial=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		
		for(int i=1; i<n; i++) // initialise , test , execute , increment
		{
			factorial= factorial*(i+1);	
		}
		System.out.println(factorial);

	}

}
