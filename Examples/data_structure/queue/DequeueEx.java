package queue;

import java.util.LinkedList;
import java.util.Queue;

public class DequeueEx {
	
	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(23);
		queue.offer(25);
		queue.offer(22);
		queue.offer(28);
		
		// Removes front ele
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
