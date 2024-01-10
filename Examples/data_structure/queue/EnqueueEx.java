package queue;
import java.util.Queue;
import java.util.LinkedList;

public class EnqueueEx {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(23);
		queue.offer(25);
		queue.offer(22);
		queue.offer(28);
		// front element(FIFO)
		System.out.println(queue.peek());
		// Removes front ele
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
