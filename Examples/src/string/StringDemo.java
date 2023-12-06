package string;
import java.util.*;

public class StringDemo {

	public static void main(String[] args) {
		
		String s = new String("durga");
		s.concat("Software");
		System.out.println(s);

		
		StringBuffer sb = new StringBuffer("durga");
		sb.append("Software");
		System.out.println(sb);
		
		String s1 = new String("durga");
		String s2 = new String("durga");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));


		StringBuffer sb1 = new StringBuffer ("durga");
		StringBuffer sb2 = new StringBuffer ("durga");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));

	}

}
