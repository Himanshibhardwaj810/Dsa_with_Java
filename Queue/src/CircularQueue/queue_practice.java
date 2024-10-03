package CircularQueue;

public class queue_practice {
	protected int[] data;
	private static final int Default_size=10;
	int size=0;
	private int front=0;
	private int end=0;

	public queue_practice() {
		this(Default_size);
	}
	public queue_practice(int size) {
		this.data=new int[size];
	}
	//isempty
	public boolean isempty() {
		return size==0;
	}
	//full
	public boolean isfull() {
		return size==data.length;
	}
	//insertion
	public void insertion(int item) {
		if(isfull()) {
			System.out.println("full");
		}
		data[end]=item;
		end++;
		end=end%data.length;
		size++;
	}
	//deleteion
	public int deletion() {
		if(isempty()) {
			System.out.println("empty");
		}
		int removed=data[front];
		front++;
		front=front%data.length;
		size--;
		return removed;
		
	}
	//display
	public void display() {
		if(isempty()) {
			System.out.println("empty");
			return;
		}
		int i=front;
		do {
			i=i%data.length;
			System.out.print(data[i]+" ->");
			i++;
		}while(i!=end);
		System.out.println("End");
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_practice queue=new queue_practice();
		queue.insertion(54);
		queue.insertion(154);
		queue.insertion(254);
		queue.insertion(354);
		queue.display();
		queue.deletion();
		queue.display();
		

	}

}
