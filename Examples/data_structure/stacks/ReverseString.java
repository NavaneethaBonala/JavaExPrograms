/* 
 * Write a java program to reverse a string using stack data structure
 */

package stacks;
import java.util.Stack;
import java.util.Scanner;

public class ReverseString {
		
	public boolean reverse(String input) {
		Stack<Character> s = new Stack();
		 
		for (char e : input.toCharArray())
		{
			s.push(e);
		}
		
		while(!s.isEmpty())
		{
			System.out.print(s.pop());
		}
		return true ;		
	}
		
	public static void main(String[] args) {
		
		ReverseString revstr = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("Original String : "+str);
		System.out.print("Reversed String : ");
		 revstr.reverse(str);
	}
}
