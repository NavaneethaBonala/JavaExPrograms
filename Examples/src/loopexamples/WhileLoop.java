package loopexamples;
public class WhileLoop {

	public static void main(String[] args) {
		int count = 0;
		while (count < 5) {
			System.out.println("Count is: " + count);
			count++;
		}
		System.out.println("The value of count after the loop is " + count);
	}
}

