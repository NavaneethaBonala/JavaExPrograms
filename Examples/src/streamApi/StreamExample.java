package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamExample
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Intermediate Operation: filter to check for even numbers
		List<Integer> evenNumbers = numbers.stream()
				.filter(n -> n % 2 == 0) // Keep even numbers
				.collect(Collectors.toList());
		System.out.println("Even numbers: " + evenNumbers);
	//--------------------------------------------------------------------------------------------------
		// Intermediate Operation: map to Square each number
		List<Integer> squares = numbers.stream()
				.map(n -> n * n) // Square each number
				.collect(Collectors.toList());
		System.out.println("Squares: " + squares);
	//--------------------------------------------------------------------------------------------------
	
		// Terminal Operation: reduce to fetch single result
		int sum = numbers.stream()
				.reduce(0, (a, b) -> a + b); // Calculate the sum
		System.out.println("Sum: " + sum);
		
	}
}
