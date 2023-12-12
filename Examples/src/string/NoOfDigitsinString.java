/*
 * Read a String and find the no of alphabets, digits, words, spaces, and symbols
 * and display all the counting to the user.
 * India is my country.
 * symbols : 1
 * digits : 0
 * spaces : 3
 * words : 4
 * alphabets : 16
 */


package string;
import java.util. *;

public class NoOfDigitsinString {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		int alpha, digits, spaces, symbols, i;
		alpha= digits= spaces= symbols=0;
		
		
		for(i=0;i<str.length();i++)
		{
			
			if(str.charAt(i) == ' ')
			{
				spaces++;			
			}
			else if (str.charAt(i)>= 'a' & str.charAt(i)<= 'z' || str.charAt(i)>= 'A' & str.charAt(i)<= 'Z' )
			{
				alpha++;
			}
			else if (str.charAt(i)>= '0' & str.charAt(i)<= '9')
			{
				digits++;
			}
			else 
				symbols++;
		}
		
		System.out.println("Number of Alphabet in Given String : "+ alpha);
		System.out.println("Number of Digits in Given String : "+digits);
		System.out.println("Number of Spaces in Given String : "+spaces);
		System.out.println("Number of Symbols in Given String : "+symbols);

	}
}


