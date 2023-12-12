package arrays;

import java.util.*;

public class Student1 
{ 

	public static void main(String[] args)
	{
			
			float[] avg = new float[2]; //array
			String[] sname = new String[2]; //array of objects
			
			Scanner sc= new Scanner(System.in);
			
			for(int i=0;i<avg.length;i++)
			{
				System.out.println("Enter "+ i + " student name");
				sname[i]=sc.next();
				System.out.println("Enter "+ i + " averagae marks ");
				avg[i]= sc.nextFloat();
			}
			
			//display all the data from array
			for(int i=0;i<avg.length;i++)
				System.out.println(avg[i]+"\t"+ sname[i]);

		}

	}


