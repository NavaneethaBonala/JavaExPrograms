package lambdaExpression;

import java.util.function.*;
public class FunctionInterfaceTest {
	public static void main(String args[]) {
		String[] countries = {"India", "Australia", "Bangladesh", "England",
				"South Africa", "Srilanka", "Newzealand", "West Indies",
		"Scotland"};
		// We are redlining the apply function of the Function interface here.
		// In this lambda expression there is single parameter “all”
		// As defined in the rule of lambda we need not declare the type
		// of the parameter. However it will be understood from the context by Java
		// runtime.
		// In this case it is a List of Strings.
		// This method will be called when call the converter.apply()
		// method.
		Function<String[], String> converter = (all) -> { // lambda expression
			// We pass a List of String through this parameter “all”
			String names = "";
			// Iterating through all the Strings in the list “all”
			for(String n : all) {
				names += n + " "; // concatenate all names
			}
			return names; // return concatenated String
		};
		// When we call the apply() method, the lambda expression will be called
		// and the List of countries will be passed as arguments.
		System.out.println(converter.apply(countries));
	}
}
