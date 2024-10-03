package Queue;

public class queue_practice {
	protected int[] data;
	private static final int Default_size=10;
	int ptr=0;
	
	public queue_practice() {
		this(Default_size);
	}

	public queue_practice(int size) {
		this.data=new int[size];
	}
	//overflow condition
	public boolean isfull() {
		return ptr==data.length;
	}
	public boolean isempty() {
		return ptr==0;
	}
	//insertion
	public void insertion(int item) {
		if(isfull()) {
			System.out.println("full");
		}
		
		data[ptr]=item;
		ptr++;
		
	}
	
	//deletion
	public int deletion() {
		if(isempty()) {
			System.out.println("empty");
		}
		int del=data[0];
		for(int i=1;i<ptr;i++) {
			data[i-1]=data[i];
		}
		ptr--;
		return del;
	}
	//display
	public void display() {
		if(isempty()) {
			System.out.println("empty");
		}
		for(int i=0;i<ptr;i++) {
			System.out.println(data[i]);
			
		}
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_practice queue=new queue_practice();
		queue.insertion(566);
		queue.insertion(562);
		queue.insertion(561);
		queue.insertion(562);
		queue.insertion(526);
		queue.display();
	}

}
