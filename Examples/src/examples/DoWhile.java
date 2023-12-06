/*
 * Write a do-while loop that asks the user to enter two numbers.
 *  The numbers should be added and the sum displayed.
 *   The loop should ask the user whether he or she wishes to perform the operation again. 
 * If so, the loop should repeat; otherwise it should terminate.
 */

package examples;// User defined Package Declaration
import java.util.*;// in built Package Declaration

public class DoWhile { // Class Declaration

	public static void main(String[] args) {// Main Method

		//Object created to take input from user
		Scanner sc = new Scanner(System.in);
		//data members
		int a,b;
		char repeat;
		// dowhile loop to add two numbers
		do
		{
			System.out.println("Enter two Numbers : ");
			a= sc.nextInt();
			b = sc.nextInt();
			System.out.println("Sum of Two numbers : "+(a+b));
			System.out.print("Do you want to perform the operation again? (y/n): ");
			repeat = sc.next().charAt(0);

			// while loop to check whether to continue the loop or Not
        } while (repeat == 'y' || repeat == 'Y');
		System.out.println("End of the Operation");
		
	}

}
