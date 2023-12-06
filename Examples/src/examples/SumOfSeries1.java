package examples;

import java.util.Scanner;

public class SumOfSeries1 {

	public static void main(String[] args) {
		// s=1/x - 2/x + 3/x - 4/x ............ n/x
		int i;
		float n, x, s=0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter limit of the series : " );
		n= obj.nextInt();
		
		System.out.println("Enter x value : " );
		x = obj.nextInt();
		
		for (i=1 ; i<=n; i++)
		{
			//s = s + (float) i/x - (float) i+1/x;
			//s += (float) i/x - (float) i+1/x;
			if (i%2==0)
				s += (float) i/x;
			else
				s -= (float) i/x;
			
		}
		System.out.println("Sum of the Series 1/x - 2/x + 3/x - 4/x ............ n/x:" + s);

	}

}
