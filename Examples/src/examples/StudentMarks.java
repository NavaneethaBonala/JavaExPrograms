package examples;

import java.util.*;

public class StudentMarks {

	public static void main(String[] args) {
		
		String name;

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Name of the student ");
		name=obj.next();
		System.out.println("Enter Rollno of the student ");
		int rollno=obj.nextInt();
		System.out.println("Enter Sub1 Marks : ");
		int marks1 = obj.nextInt();
		System.out.println("Enter Sub2 Marks : ");
		int marks2 = obj.nextInt();
		System.out.println("Enter Sub3 Marks : ");
		int marks3 = obj.nextInt();
		System.out.println("Enter Sub4 Marks : ");
		int marks4 = obj.nextInt();
		
		System.out.println("Name of the student : " + name);
		System.out.println("Rollno of the student : " + rollno);
		System.out.println("Sub1 Marks : " + marks1);
		System.out.println("Sub2 Marks : " + marks2);
		System.out.println("Sub3 Marks : " + marks3);
		System.out.println("Sub4 Marks : " + marks4);
		
		if (marks1 > 40 & marks2 > 40 & marks3 > 40 & marks4 > 40)
		{
			int total = (marks1 + marks2 + marks3 + marks4);
			float avg = total / 4;
				System.out.println("Result : Passed");
				System.out.println("Percentage : " + avg);
				if (avg >= 75)
				{
					System.out.println("Grade A");
				}
				else if (avg < 75 & avg >=60)
				{
					System.out.println("Grade B");
				}
				else
					System.out.println("Grade C");
		}
		else 
		{
			System.out.println("Result : Failed");
			System.out.println("No Grade ");
		}
			
	}

}
