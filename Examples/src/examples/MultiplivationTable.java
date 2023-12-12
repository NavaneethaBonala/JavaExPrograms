/*
 * Read table number and range, display multiplication table
Table no 5
Range 15 
1 X 5 = 5
 */


package examples;
import java.util.*;

public class MultiplivationTable {

	public static void main(String[] args) {
		
		int i , j;
		
		for(i=5; i<=5; i++)
		{
			System.out.println("Table No : "+ i );
			for ( j=1; j<=15; j++)
			
			System.out.println(i + "X" + j + "="+ (i*j));
		}
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Table No : " );
		int N = obj.nextInt();
		
		System.out.println("Enter Range" );
		int R = obj.nextInt();
		
		
		for (i=1; i<=R; i++)
			System.out.println(N + "X" + i + "="+ (i*N));

	}

}
