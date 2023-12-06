/*
 * 1. read and store student records with rollno, name, average marks of 10 students using arrays. and display the same to user. display the student list who are scored above 60 as average marks.
 
 */

package arrays;

import java.util.*;

public class C {
	public static void main(String args[]) {
		
        // Define the number of students
        int numStudents = 3,i;
        
        Scanner sc = new Scanner(System.in);
        
        int rollNo[] = new int[numStudents];
        String name[] = new String[numStudents];
        float[] averageMarks = new float[numStudents];

        sc.close();
        for (i = 0; i < numStudents; i++)
        {
            
            System.out.println("Enter student " + (i+1) + " details :");
            System.out.print("Roll No: ");
            rollNo[i] = sc.nextInt();
            
            System.out.print("Name : ");
            name[i] = sc.next();
            
            System.out.print("Average Marks : ");
            averageMarks[i]=sc.nextFloat();
        
        }
        
        
        System.out.println("Details of "+numStudents+" Students");
        
        for (i = 0; i < numStudents; i++) 
        {
            System.out.println(rollNo[i] + "\t" + name[i] + "\t"  + averageMarks[i] + "\t");
        
        }
        
        System.out.println("Students scored above 60 average marks : ");
        
        for (i = 0; i < numStudents; i++)
        {
        	if(averageMarks[i]>60) 
        	{
                System.out.println(rollNo[i] + "\t" + name[i] + "\t"  + averageMarks[i] + "\t");
        	}
        }	
        
    }

}
