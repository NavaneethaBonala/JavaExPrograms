// Multiple catch block for each related exception 

package exceptionhandling;

import java.util.Scanner;

public class Excep1 {

	        public static void main(String argv[])
	        {
	                int a=0,b=0,c,d;
	                Scanner scanner = new Scanner(System.in);
	                
	                System.out.print("Enter the first number: ");
		            double num1 = scanner.nextDouble();

		            System.out.print("Enter the second number: ");
		            double num2 = scanner.nextDouble();

	        try
	        {
	               
	                c = a/b;
	                System.out.println(a + "/" + b + "=" + c);
	                }
	        catch(ArrayIndexOutOfBoundsException e)
	        {
	                System.out.println("Pass 2 args : " );
	                }
	        catch(ArithmeticException e)
	        {
	                System.out.println("Second arg must be non-zero value : ");
	                }
	// Catch with Common Exception must be specified as a last catch function in try block.
	        catch(Exception e)
	        {
	                System.out.println("Common Exception : " + e);
	                }

	                d = a*b;
	                System.out.println(a + "*" + b + "=" + d);
	                }
	        }