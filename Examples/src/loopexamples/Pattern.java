package loopexamples;

import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner (System.in);
		
		int i,n = 10,j;
		
		//System.out.println("Enter the Number : ");
		//n = obj.nextInt();
		/*
		 * 1
			2
			3
			4
			5
		 */
		for (i=1; i<=5; i++)
		{
			System.out.println(i);
		}
		
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
		 */
			
		for (i=1; i<=5; i++)
		{
			for (j=1; j<=i; j++)
			{
				
				if ((j)%2==0)
					System.out.print("#");
				else
					System.out.print("*" );
			}
			System.out.println();
		}
/*
 		1 
        2 2 
       3 3 3 
      4 4 4 4 
     5 5 5 5 5 
    6 6 6 6 6 6 
   7 7 7 7 7 7 7 
  8 8 8 8 8 8 8 8 
 9 9 9 9 9 9 9 9 9 
10 10 10 10 10 10 10 		
 */
	
		
		for (i=1; i<=n; i++)
		{
			 for (j = 1; j <= n - i; j++) { 
	                System.out.print(" "); 
	            } 
	            // inner loop to print star 
	            for (j = 1; j <= i; j++) { 
	                System.out.print(i+" " ); 
	            }
			System.out.println( );
		}
			
		
/*
        99
       888
      7777
     66666
    555555
   4444444
  33333333
 222222222
1111111111
 */
		for (i = n; i >= 1; i--) { 
			  
            // inner loop to print spaces. 
            for (j = 1; j < i; j++) { 
                System.out.print(" "); 
            } 
  
            // inner loop to print stars. 
            for (j = 0; j <= n - i; j++) { 
                System.out.print( i); 
            } 
  
            // printing new line for each row 
            System.out.println(); 
		
	}

}
}
                                                             