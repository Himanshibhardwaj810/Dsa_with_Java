package Queue;
import java.util.*;

public class queue_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new LinkedList<>();
		queue.add(45);
		queue.add(145);
		queue.add(245);
		queue.add(345);
		queue.remove();
		queue.peek();
		System.out.println(queue);
		System.out.println(queue.remove());
		//Dequeue
		System.out.println("deque");
		Deque<Integer> deque=new ArrayDeque();
		deque.add(45);
		deque.add(245);
		
		System.out.println(deque);
		deque.addFirst(21);
		System.out.println(deque);
		deque.offerFirst(411);
		System.out.println(deque);
		deque.removeLast();
		System.out.println(deque);

	}

}
