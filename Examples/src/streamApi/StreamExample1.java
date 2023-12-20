package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {
		// Create a list of Person objects
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));
		people.add(new Person("David", 28));
		people.add(new Person("Eve", 40));
		// Using Stream API to perform operations on the list
		// 1. Filter people older than 30
		List<Person> olderThan30 = people.stream()
				.filter(person -> person.getAge() > 30)
				.collect(Collectors.toList());
		System.out.println("People older than 30: " + olderThan30);
		// 2. Map person objects to their names
		List<String> names = people.stream()
				.map(Person::getName)
				.collect(Collectors.toList());
		System.out.println("Names of people: " + names);
		// 3. Calculate the average age of people
		double averageAge = people.stream()
				.mapToInt(Person::getAge)
				.average()
				.orElse(0.0);
		System.out.println("Average age: " + averageAge);
		// 4. Check if there is any person with a specific name
		boolean hasAlice = people.stream()
				.anyMatch(person -> person.getName().equals("Alice"));
		System.out.println("Is there anyone named Alice? " + hasAlice);
	}
}
