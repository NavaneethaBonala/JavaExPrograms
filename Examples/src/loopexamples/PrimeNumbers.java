package loopexamples;

import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner (System.in);
		
		int i,n,j;

		System.out.println("Enter the Number : ");
		n = obj.nextInt();
	
		for(i=2; i<=n; i++)
		{
			int count=0;
			for (j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;// here count means the count of numbers 
					//that are divisible and remainder is zero 
				}
			}
		
			if(count==2){//here count is 2 i.e, i values has 2 factors 
				System.out.println(i);	
			}
		}
							
	}
}
					
		
	
	

	



