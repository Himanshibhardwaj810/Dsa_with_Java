package CircularQueue;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CircularQueue queue=new CircularQueue(5);
		queue.insert(45);
		queue.insert(145);
		queue.insert(245);
		queue.insert(45);
		queue.insert(945);
		queue.display();
//		System.out.println(queue.remove());
//		queue.display();
		queue.insert(1945);
		queue.display();
//		System.out.println(queue.remove());
//		queue.display();
		DynamicQueue queue1=new DynamicQueue();
		System.out.println("Dynamic Queue");
		queue.insert(45);
		queue.insert(145);
		queue.insert(245);
		queue.insert(45);
		queue.insert(945);
		queue.insert(1945);
		queue.display();

	}

}
