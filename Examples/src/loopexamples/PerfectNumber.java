package loopexamples;

import java.util.Scanner;  

public class PerfectNumber 
{  
	public static void main(String args[])    
	{  
	
		Scanner sc = new Scanner(System.in);
		
		int i,n,sum=0;
		
		System.out.println("Enter the Number : ");
		n= sc.nextInt();
		
		for (i=1;i<n;i++)
		{
			if(n%i==0) 
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		if(n==sum)
			System.out.println(n+" is a perfect number");
	}  
}
