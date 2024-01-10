package queue;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	
	public static void main(String[] args)
	{
		Queue<String> pq = new PriorityQueue<>();
		Queue<Integer> pq1 = new PriorityQueue<>();
		// Priority queue removes the firts letter from alphabet(A-Z) value
		pq.offer("PineApple");
		pq.offer("Banana");
		pq.offer("Orange");
		pq.offer("Grapes");
		pq.offer("sapota");
		
		System.out.println(pq);
		System.out.println(pq.poll());
		// Priority queue removes the lowest integer value
		pq1.offer(10);
		pq1.offer(20);
		pq1.offer(15);
		pq1.offer(40);
		pq1.offer(10);
		
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);
		// we can also write in this way
		Integer highestPriority = pq1.poll(); // Removes and returns 1
		System.out.println(highestPriority); // Output: 1
	}

}
