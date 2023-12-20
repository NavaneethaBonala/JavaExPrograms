package lambdaExpression;

import java.util.function.UnaryOperator;
public class UnaryOperatorExample {
	public static void main(String[] args) {
		// Define a UnaryOperator to square an integer
		UnaryOperator<Integer> square = (number) -> number * number;
		int result = square.apply(5); // Square the number 5
		System.out.println("Squared result: " + result);
	}
}
