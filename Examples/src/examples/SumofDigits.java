package examples;

import java.util.*;

public class SumofDigits {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		int n, n1, count = 0;
		int r, sum=0, rev = 0;
		
		System.out.println("Enter your Number : ");
		n=obj.nextInt();
		n1 = n;
		
		/*both in while loop
		//while (n>0)
		//	n = n/10;
		//	r = n%10;
		//	sum=sum+r;
		//	n= n/10;
			count++;*/
		
		// Count of Digits
		while (n>0)
		{
			n = n/10;
			count++;
		}
		System.out.println("Count of Digits : "+ count);
		
		//Sum of Digits
		
		while (n1>0)
		{
			r = n1%10;
			sum=sum+r;
			n1= n1/10;
		}
		System.out.println("sum of Digits : "+sum);
		
		
		
	}

}
