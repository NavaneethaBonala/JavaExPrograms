package arrays;

import java.util.*;

public class StoreElements {

	public static void main(String[] args) {
	

		int[] iarray; // single dimension array declaration
		int i,n;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter no of elements : ");
		n=obj.nextInt();
		
		//dynamic memory allocation
		iarray = new int[n]; //int[n] , n = number of elements, [n] = index 
		
		System.out.println("Enter "+n+" elements to the array");
	
		
		for (i=0; i<n; i++)
		{
			// read and store the element to the array
			iarray[i] = obj.nextInt();
			
		}
		
		// filter only odd numbers
		
		System.out.println("Odd numbers in an array");
		for (i=0; i<n; i++)
		{
			if(iarray[i]%2>0)
				System.out.println(iarray[i]);
			
		} 
		
		// after sorting elements
		System.out.println("Sorted Data");
		Arrays.sort(iarray); //algorithm
		
		for (i=0; i<n;i++)
			System.out.println(iarray[i]);
		
	}

}
