package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/*
 * In this example we call the accept method directly.
 */
public class ConsumerExample2 {
	public static void main(String[] args) {
		// Create a list of integers
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		// We override accept method of the Consumer
		// to print the sum of the items in the list.
		Consumer<List<Integer>> printSumOfItems =
				list -> {
					// Return sum of list values
					int result = 0;
					for(int val:list) {
						result+=val;
					}
					System.out.println("Sum of list values: "+result);
				};
				// Now we print the sum by calling accept method
				printSumOfItems.accept(numbers); // Calling Consumer method
	}
}
