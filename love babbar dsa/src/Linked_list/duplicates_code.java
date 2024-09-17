package Linked_list;

public class duplicates_code {

	Node head;
	Node tail;
	int size;

	public duplicates_code() {
		this.size = 0;
	}

	// insertion
	public void insert(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
			return;
		}
		size++;
	}

	// find and removal of duplicates
	public void duplicates() {
		Node curr = head;
		while (curr != null && curr.next != null) {
			if (curr.value == curr.next.value) {
				curr.next = curr.next.next;
				size--;
			} else {
				// Move to the next node if no duplicate
				curr = curr.next;
			}
		}
	}

	// unsorted duplicates
	public void unsorted_duplicates() {
		Node curr = head;
		while (curr != null && curr.next != null) {
			Node newcurr = curr;
			while (newcurr != null && newcurr.next != null) {
				if (curr.value == newcurr.next.value) {
					newcurr.next = newcurr.next.next;
					size--;
				} else {
					// Move to the next node if no duplicate
					newcurr = newcurr.next;
				}
			}
			curr = curr.next;
		}
	}

	// display
	public void display() {
		Node node = head;
		while (node != null) {
			System.out.print(node.value + "->");
			node = node.next;
		}
		System.out.println("END");
	}

	private class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}

}
