package stacks;

public class StackExampleUsingArrayList {
	public static void main(String[] args) {
		StackUsingArrayList<Integer> stack = new StackUsingArrayList<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("Stack is empty: " + stack.isEmpty());
		System.out.println("Top element: " + stack.peek());
		while (!stack.isEmpty()) {
			System.out.println("Popped: " + stack.pop());
		}
		System.out.println("Stack is empty after popping all elements: " + stack.isEmpty());
	}
}
