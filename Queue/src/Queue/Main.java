package Queue;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustomQueue queue = new CustomQueue(5);
		queue.insert(45);
		queue.insert(145);
		queue.insert(245);
		queue.insert(45);
		queue.insert(45);
		queue.display();
		System.out.println(queue.remove());
		queue.display();
	}

}
