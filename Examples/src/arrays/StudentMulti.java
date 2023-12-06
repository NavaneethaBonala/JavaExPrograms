package arrays;

import java.util.*;

public class StudentMulti {

	public static void main(String[] args) {
		 	
		String sname[]= new String[10];
		int[] rollno = new int[10];
		int[][] marks = new int[10][5];
		int[] total = new int[10];
		int[] avg = new int[10];
		String result[] = new String[10];
		
		int n, i;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		for (i=0; i<n; i++)
		{
			System.out.println("Enter "+ i+1 + " Records");
			System.out.println("Enter Roll No");
			rollno[i] = sc.nextInt();
			System.out.println("Name : ");
			sname[i] = sc.next();
			
			System.out.println("Enter 5 subject Marks : ");
			for (int j = 0; j<n ; j++) {
				
			}
		}

	}

}
