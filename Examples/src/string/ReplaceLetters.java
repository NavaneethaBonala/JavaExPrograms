package string;

import java.util.Scanner;

public class ReplaceLetters {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String : ");
		// string str variable to hold the input String
		String str = sc.nextLine();
		
		//char ch;
		for(int i=0;i<str.length();i++)
		{
			//ch=str.charAt(i);
			if(str.charAt(i)==' ' )
				System.out.print(str.charAt(i));
			else if(str.charAt(i)=='A' ||str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i) =='U' ||str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i) =='u')
				System.out.print((char)(str.charAt(i)+1));
			else
				System.out.print((char)(str.charAt(i)-1));
		}
		sc.close();
	}

}


