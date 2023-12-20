package lambdaExpression;

import java.util.function.Supplier;
public class SupplierInterfaceExample {
	public static void main(String[] args) {
		// Define a Supplier that generates a random number between 1 and 100
		Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100) + 1;
		// Get a random number using the Supplier
		int randomValue = randomNumberSupplier.get();
		System.out.println("Random Number is: " + randomValue);
	}
}