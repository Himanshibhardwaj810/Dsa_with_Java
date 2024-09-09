package CircularQueue;

public class DynamicQueue extends CircularQueue{
	public DynamicQueue() {
		super();// this will call parent class i.e Custom_Stack() constructor
	}

	public DynamicQueue(int size) {
		super(size);// it will call Custom_Stack(size);
	}

	@Override
	public boolean insert(int item) {
		// TODO Auto-generated method stub
		if(this.isFull()) {
			int[] temp=new int[data.length*2];
			//copy the data items in temp array
			for (int i=0;i<data.length;i++) {
				temp[i]=data[(front+i)%data.length];//as element are displayed from front
			}
			front=0;
			end=data.length;
			data=temp;
		}
		return super.insert(item);
	}
	
	
	
	
	

}
