package examples;

public class UnaryOperator {

	public static void main(String[] args) {
		/*int i = 10;
		int j = 10;
		System.out.println(j += j - ++i);
		
		int a = 2, b = 3;
		int c,d ;
		c = (++a / ++b) + (a++ * b++);
		d  = (++a / ++b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		int a1 = 10, b1 = -20;
		float sum ;
		sum = (++a1 / b1) + (a1*b1--);
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(sum);
		*/
		int a = 10 ; int b = 10 ; 
		System.out.println(a++ + ++a); //10+12=22
		System.out.println(b++ + b++); // 10 + 11 = 21

				
	}

}
