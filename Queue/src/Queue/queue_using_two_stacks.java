package Queue;
import java.util.*;
public class queue_using_two_stacks {
	Stack<Integer>stack1;
	Stack<Integer>stack2;

	public queue_using_two_stacks() {
		stack1=new Stack<>();
		stack2=new Stack<>();
	}
	public void enqueue(int item) {
		stack1.push(item);
		return;
	}
	//dequeue
	public int dequeue() {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	//empty
	public boolean empty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_using_two_stacks queue=new queue_using_two_stacks();
	    queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());  // Output: 1
        System.out.println(queue.dequeue());  // Output: 2
        System.out.println(queue.dequeue());  // Output: 3

	}

}
