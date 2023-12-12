//read arguments from commandline

package examples;

import java.util.*;

class Cmd_Args
{
	public static void main(String[] sun)
	{
		/*System.out.println("Name " + sun[0]);
		System.out.println("Rollno " + sun[1]);
		*/

		//print all command line arguments

		/*
		for(int i=0;i<sun.length;i++)
			System.out.println("argument  "  + sun[i]);
		*/

		int a, b;
		a= Integer.parseInt(sun[0]);
		b= Integer.parseInt(sun[1]);

		System.out.println("Sum of 2 args " + (a+b));
}
}
