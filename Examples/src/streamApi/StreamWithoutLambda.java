package streamApi;

import java.util.*;
import java.util.List;
import java.util.function.Consumer;

public class StreamWithoutLambda 
{
	public static void main(String[] args) 
	{
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		// Using anonymous inner class
		names.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});
	}
}