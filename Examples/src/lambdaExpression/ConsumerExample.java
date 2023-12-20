package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerExample {
	public static void main(String[] args) {
		// Create a list of integers
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		// Define a Consumer to print each element of the list.
		// accept () method of the Function interface is overridden here.
		Consumer<Integer> printNumber = (number) ->
		System.out.println(number);
		// Use the forEach method to apply the Consumer
		// to each element in the list
		// In Java, the forEach method is used to iterate through elements
		// in a collection (such as a List) and apply a specified action
		// to each element. It can do this by accepting a
		// Consumer functional interface, which defines the accept () method.
		// Inside the forEach the accept method is called for each item.
		numbers.forEach(printNumber); // accpet() method called here
		// It will call the method defined in the last line
		// while assigning the variable printNumber
	}
}
