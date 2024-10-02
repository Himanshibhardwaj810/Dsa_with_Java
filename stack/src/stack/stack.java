package stack;

public class stack {
	protected int[] data;
	private static final int Default_size = 10;
	int ptr = -1;

	public stack() {
		this(Default_size);
	}

	public stack(int size) {
		this.data = new int[size];
	}

	// is empty
	public boolean isempty() {
		if (ptr == -1) {
			return true;
		}
		return false;
	}

	// isfull
	public boolean isfull() {
		if (ptr == data.length - 1) {
			return true;
		}
		return false;
	}

	// push operation
	public boolean push(int item) {
		if (isfull()) {
			System.out.println("cant be pushed");
		}
		ptr++;
		data[ptr] = item;
		return true;

	}
	//pop opr
	public int pop() {
		if(isempty()) {
			System.out.println("can't pop");
			return -1;
		}
		int removed=data[ptr];
		ptr--;
		return removed;
		
	}
	//display
	public void display() {
		if(isempty()) {
			System.out.println("empty");
		}
		for(int i=0;i<=ptr;i++) {
			System.out.print(data[i]+",");
			System.out.println();
		}
	}
	//peek
	public void peek() {
		if(isempty()) {
			System.out.println("empty");
		}
		System.out.println(data[ptr]+"hgfuh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack stack1=new stack(5);
		stack1.push(45);
		stack1.push(145);
		stack1.push(245);
		stack1.push(345);
		stack1.display();
		stack1.peek();
		stack1.pop();
		stack1.display();

	}

}
