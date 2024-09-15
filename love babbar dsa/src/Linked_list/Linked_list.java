package Linked_list;

public class Linked_list {
	Node head;
	private Node tail;
	private int size;

	public Linked_list() {
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

	// reversal of singly linked list
	public void reverse() {
		if (head == null || head.next == null) {
			return;
		}
		Node prev = null;
		Node curr = head;
		Node next = null;
		while (curr != null) {
			// store the next
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		// After the loop, prev will be the new head
		tail = head; // The old head becomes the new tail
		head = prev; // The last node becomes the new head
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

	// reverse with recursion
	public void recursionreverse() {
		if (head == null || head.next == null) {
			return;
		}
		tail = head;
		head = recursivehead(head);

	}

	public Node recursivehead(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node newhead = recursivehead(head.next);
		head.next.next = head;
		head.next = null;

		return newhead;
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
