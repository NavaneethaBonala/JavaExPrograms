package arrays;

import java.util.*;

public class Array2 {

	public static void main(String[] args) {
		
		float[] avg = new float[5]; //array
		String[] sname = new String[5]; 
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<avg.length;i++)
		{
			System.out.println("Enter "+i+" Student Name");
			sname[i] = sc.next();
			System.out.println("Enter "+sname[i]+" Average Marks");
			avg[i] = sc.nextFloat();
		}
		
		// display all the data from array
		for (int i = 0; i<avg.length;i++)
			System.out.println(avg[i]+"\t"+sname[i]);
		
		sc.close();
	}

}
