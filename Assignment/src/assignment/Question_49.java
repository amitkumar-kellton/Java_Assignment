package assignment;

import java.util.PriorityQueue;
import java.util.Queue;

public class Question_49 {

	public static void main(String[] args) {

		System.out.println("\nQuestion 49- Implement a Priority Queue – Create a priority queue.\n\n");

		Queue<Integer> queue = new PriorityQueue<>();

		queue.offer(5);
		queue.offer(4);
		queue.offer(3);
		queue.offer(2);
		queue.offer(1);

		while (!queue.isEmpty()) {
			System.out.println("Queue Data: " + queue.poll());
		}
	}

}

//Queue<Integer> queue = new LinkedList<>();