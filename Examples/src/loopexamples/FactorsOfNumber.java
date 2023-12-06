package loopexamples;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args)
	{
	
		Scanner obj = new Scanner (System.in);
		
		int i,n; 

		System.out.println("Enter the Number : ");
		n = obj.nextInt();
		
		System.out.println("factors of "+n+ " are ");
		
		for (i=1; i<=n; i++)
		{
			if(n%i==0) 
				System.out.println(i);	
		}
		obj.close();
	}
}



