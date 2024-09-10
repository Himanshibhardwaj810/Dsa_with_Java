package Queue;
import Queue.queueException;

public class CustomQueue {
	protected int[] data;
	private static final int Default_size = 10;
	int ptr = 0;

	public CustomQueue() {
		this(Default_size);//calling constructor with another constructor
	}

	public CustomQueue(int size) {
		
		this.data = new int[size];
	}
	//overflow
	public boolean isFull() {
		return ptr==data.length;//ptr at last index//as item is inserted first
	}
	//underflow
	public boolean isEmpty() {
		return ptr==0;//ptr at last index
	}
	//insertion
	public boolean insert(int item) {
		if(isFull()) {
			return false;
		}
		data[ptr]=item;//here item is inserted first 
		ptr++;
		return true;
		
	}
	//deletion
	public int remove() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int removed=data[0];
		//shift the elements to left
		for(int i=1;i<ptr;i++) {
			data[i-1]=data[i];
		}
		
		ptr--;
		return removed;
	}
	//the item at front
	public int front() throws queueException{
		if(isEmpty()) {
			throw new queueException("Queue is empty");
		}
		return data[0];
	}
	//display
	public void display() {
		for(int i=0;i<ptr;i++) {
			System.out.print(data[i]+"<- ");
		}
		System.out.println("end");
	}
	
	
	
}
