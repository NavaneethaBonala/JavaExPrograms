package lambdaExpression;

import java.util.*;
import java.util.function.*;
/*
In this example we created a static method getBeginWith () which has two parameters. One of them is a
list of String. Other one is the Predicate. The test method of the Predicate is called within this method
 */
public class PredicateTest {
	private static List getBeginWith(List<String> list, Predicate<String> valid) {
		List<String> selected = new ArrayList<>();
		list.forEach(country -> { // lambda expression
			if(valid.test(country)) { // Calling test method on the predicate
				selected.add(country);
			}
		});
		return selected;
	}
	public static void main(String[] args) {
		String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka",
				"Newzealand", "West Indies"};
		List<String> countryList = Arrays.asList(countries);
		// Second argument in this function call is the test method of the Predicate.
		// This statement will test if the country name starts with “A”.
		System.out.println(getBeginWith(countryList, (s) -> s.startsWith("A")));
		System.out.println(getBeginWith(countryList, (s) -> s.contains("W")));
		System.out.println(getBeginWith(countryList, (s) -> s.endsWith("nd")));
	}
}