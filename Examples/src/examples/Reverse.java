package examples;

import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		
		int r,n;
		int rev = 0;
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter an integer input : ");
		n=obj.nextInt();
		
		for(int i = 1;  i<n ; i++)
		{
			r=n%10;
			n=n/10;
			rev=(rev*10)+r;
		}
		System.out.println("Reverse of a number : "+rev);

	}

}
