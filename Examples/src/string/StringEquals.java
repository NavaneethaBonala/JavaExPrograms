package string;

public class StringEquals {

	public static void main(String[] args) {

		// NEW keyword = heap and scp
		String s1 = new String("You cannot change Me");
		
		// NEW keyword = heap and in scp already present which is inserted by s1
		String s2 = new String("You cannot change Me");
		System.out.println(s1==s2);// == operator ,this is compared to objects 
		
		// only string literal is inserted in scp, here  s3 value is alreaady present in scp so no duplictaes
		String s3 = "You cannot change Me";
		System.out.println(s1==s3);
		
		//here s4 value is alreaady present in scp so no duplictaes
		String s4 = "You cannot change Me";
		System.out.println(s3==s4);
		
		//here "you cannot" is a constant , "change me"is a constant , so contant are added at compile time . as it is present already in scp
		String s5 = "You cannot "+"change Me";
		System.out.println(s4==s5);
		
		// s6 is stirng literal, scp is cretaed
		String s6 = "You cannot ";
		
		// s7 ' change Me" is vcreated in scp, s6 is a reference now , added at runtime to s6+change me , so s7 is in heap area no scp
		String s7 = s6+"change Me"; 
		System.out.println(s4==s7);// false
		
		// here final s8 is literal -> scp, alreay inserted by s6, so no duplictaes
		// as s8 is final, it is constant now, whch now acts as s6 and , s9 is same as s1 now in scp
		final String s8 = "You cannot " ;
		String s9 = s8 + "change Me";
		System.out.println(s4==s9); //true
	}

}
