package examples;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// s=1/x + 2/x + 3/x + ............ n/x
		
		int i;
		float n, x, s=0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter limit of the series : " );
		n= obj.nextInt();
		
		System.out.println("Enter x value : " );
		x = obj.nextInt();
		
		for (i=1 ; i<=n; i++)
		{
			s += (float) i/x;
		}
		System.out.println("Sum of the Series s=1/x + 2/x + 3/x + ............ n/x :" + s);
	}

}
