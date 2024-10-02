package stack;

public class Custom_Stack {
	protected int[] data;
	private static final int Default_size = 10;
	int ptr = -1;

	public Custom_Stack() {
		this(Default_size);// calling constructor with another constructor
	}

	public Custom_Stack(int size) {

		this.data = new int[size];
	}

	// push operation
	public boolean push(int item) {
		if (isFull()) {
			System.out.println("Overflow or stack is full");
			return false;
		}

		ptr++;
		data[ptr] = item;
		return true;

	}

	// pop operation
	public int pop() throws StackException {
		if (isEmpty()) {
			throw new StackException("Can't pop from an empty stack");
		}
		int removed = data[ptr];
		ptr--;
		return removed;// retrun data[ptr--]

	}

	// overflow
	public boolean isFull() {
		return ptr == data.length - 1;// ptr at last index
		// and the ptr is incremented first in insert function then inserted so at index
		// 4 of size 5
		// it will be incremented to 5 and since4 the array is full so we cant insert
	}

	// underflow
	public boolean isEmpty() {
		return ptr == -1;// ptr at last index
	}

	// peek method
	public int peek() throws StackException {
		if (isEmpty()) {
			throw new StackException("Can't peek from an empty stack");
		}
		return data[ptr];
	}

	// display
	public void display() {
		if (isEmpty()) {
			System.out.println("empty");
		}else {
		for (int i = 0; i <=ptr; i++) {
			System.out.print(data[i] + ",");
		}
		System.out.println();
		}
	}
}
