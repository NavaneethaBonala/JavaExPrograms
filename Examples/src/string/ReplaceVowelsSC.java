package string;

import java.util.Scanner;

public class ReplaceVowelsSC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Enter a string with alpha and numerals");
		String str=sc.nextLine();
		
		int i;
		
			
		for(i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			
			switch(ch)
			{
			case 'a':
			case 'A':
				sb.append('m');
				break;
			case 'e':
			case 'E':
				sb.append('n');
				break;
			case 'i':
			case 'I':
				sb.append('o');
				break;
			case 'o':
			case 'O':
				sb.append('p');
				break;
			case 'u':
			case 'U':
				sb.append('q');
				break;
			default:
				sb.append(ch);		
			}			
		}
		
		System.out.println("after encoding "+ sb);
	}
}
