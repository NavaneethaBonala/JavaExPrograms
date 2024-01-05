package stacks;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Adding elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Checking if the stack is not empty
        if (!stack.isEmpty()) {
            // Comparing the first (top) and last (bottom) elements
            int firstElement = stack.peek();  // Top element
            int lastElement = stack.firstElement();  // Bottom element

            // Comparing the elements
            if (firstElement == lastElement) {
                System.out.println("The first and last elements are equal.");
            } else {
                System.out.println("The first and last elements are not equal.");
            }
        } else {
            System.out.println("The stack is empty.");
        }
    }
}
