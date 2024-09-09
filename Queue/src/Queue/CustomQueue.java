package Queue;

public class CustomQueue {
	protected int[] data;
	private static final int Default_size = 10;
	int end = 0;

	public CustomQueue() {
		this(Default_size);//calling constructor with another constructor
	}

	public CustomQueue(int size) {
		
		this.data = new int[size];
	}
	//overflow
	public boolean isFull() {
		return end==data.length;//ptr at last index
	}
	//underflow
	public boolean isEmpty() {
		return end==0;//ptr at last index
	}
	//insertion
	public boolean insert(int item) {
		if(isFull()) {
			return false;
		}
		data[end]=item;
		end++;
		return true;
		
	}
	//deletion
	public int remove() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int removed=data[0];
		//shift the elements to left
		for(int i=1;i<end;i++) {
			data[i-1]=data[i];
		}
		
		end--;
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
		for(int i=0;i<end;i++) {
			System.out.print(data[i]+"<- ");
		}
		System.out.println("end");
	}
	
	
	
}
