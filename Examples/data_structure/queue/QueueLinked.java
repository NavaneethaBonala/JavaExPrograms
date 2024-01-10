package queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinked {

	public static void main(String[] args)
	{
		Queue<String> queue = new LinkedList<>();
		// Adding elements in to the queue
		queue.add("Apple");
		queue.add("Banana");
		queue.add("Orange");
		queue.add("Grapes");
		// print all the queue elements
		System.out.println("Elements in the Queue : "+queue);
		// removes and returns the element
		System.out.println("Removed first element : "+queue.poll());
		System.out.println("Removed second element : "+queue.poll());
		// check if the queue is empty
		System.out.println("Is Queue Empty : "+queue.isEmpty());
		// returns the size of the queue
		System.out.println("The size of the queue : "+queue.size());
		// this clear() method removes the all elements from the queue
		queue.clear();
		// prints the List after removing the elements
		System.out.println("Empty Queue : "+queue);
		// check if the queue is empty
		System.out.println("Is Queue Empty : "+queue.isEmpty());
	}
}
