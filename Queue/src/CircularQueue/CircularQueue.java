package CircularQueue;

public class CircularQueue {
		protected int[] data;
		private static final int Default_size = 10;
		protected int end = 0;
		protected int front=0;
		private int size=0;
		

		public CircularQueue() {
			this(Default_size);//calling constructor with another constructor
		}

		public CircularQueue(int size) {
			this.data = new int[size];
		}
		//overflow
		public boolean isFull() {
			return size==data.length;//end may not equal to length 
		}
		//underflow
		public boolean isEmpty() {
			return size==0;//ptr at last index
		}
		//insertion end++;
		public boolean insert(int item) {
			if(isFull()) {
				System.out.println("Full");
				return false;
			}
			end=end%data.length;
			data[end]=item;
			end++;
			size++;
			return true;
			
		}
		//deletion
		public int remove() throws Exception{
			if(isEmpty()) {
				throw new Exception("Queue is empty");
			}
			int removed=data[front];
			front=front%data.length;
			front++;
			size--;
			return removed;
		}
		//the item at front
		public int front() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
			}
			return data[front];
		}
		//display
		public void display() {
			if(isEmpty()) {
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
		


}
