package arrays;

import java.util.*;

public class Array1 {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in) ;
			int n,i;
			int[] array;// Array Declaration			
			System.out.println("Enter the number of elements to add in to the Array: ");
			n=scanner.nextInt();			
			array=new int[n];// memory allocation						
			System.out.println("Enter Elements into the Array");			
			for (i=0; i<n; i++)
			{
				array[i]=scanner.nextInt(); // input the data
			}			
			for (int element : array) // print all the elements of an array
				System.out.println(element);			
			scanner.close();		
	}
	
}
