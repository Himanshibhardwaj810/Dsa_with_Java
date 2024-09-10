package stack;

public class DynamicStack extends Custom_Stack {
	public DynamicStack() {
		super();// this will call parent class i.e Custom_Stack() constructor
	}

	public DynamicStack(int size) {
		super(size);// it will call Custom_Stack(size);
	}

	@Override
	public boolean push(int item) {
		// TODO Auto-generated method stub
		if(this.isFull()) {
			int[] temp=new int[data.length*2];
			//copy the data items in temp array
			for (int i=0;i<data.length;i++) {
				temp[i]=data[i];
			}
			data=temp;
		}
		//insert item
		return super.push(item);
	}
	

}
