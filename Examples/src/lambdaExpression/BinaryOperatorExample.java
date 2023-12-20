package lambdaExpression;

import java.util.function.BinaryOperator;
public class BinaryOperatorExample {
	public static void main(String[] args) {
		// Define a BinaryOperator to add two integers
		BinaryOperator<Integer> addition = (a, b) -> a + b;
		int result = addition.apply(3, 7); // Add 3 and 7
		System.out.println("Addition result: " + result);
	}
}