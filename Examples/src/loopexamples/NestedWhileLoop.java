package loopexamples;

public class NestedWhileLoop {


	public static void main(String[] args) {
		// Example usage
		twoWhileLoops();
	}

	public static void twoWhileLoops() {
		boolean exitFirstLoop = false;

		// First while loop
		while (!exitFirstLoop) {
			// Do something in the first loop
			System.out.println("Inside the first while loop.");

			// Exit condition for the first loop
			//if (/* some exit condition */) {
			exitFirstLoop = true;
			//}

			// Second while loop
			while (exitFirstLoop) {
				// Do something in the second loop
				System.out.println("Inside the second while loop.");

				// Repeat condition for the second loop
				//if (/* some repeat condition */) {
				exitFirstLoop = false; // Reset the flag to exit the first loop
				break; // Exit the second loop and go back to the first loop
				//}
			}
		}
	}

}


