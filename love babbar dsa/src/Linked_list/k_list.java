package Linked_list;

public class k_list {
	Node head;
	private Node tail;
	private int size;

	public k_list() {
		this.size = 0;
	}

	// Modified insert method to add nodes at the end of the list
	public void insert(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = head;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	// Kth group reverse
	public Node reversekgroup(Node head, int k) {
		if (head == null) {
			return null;
		}

		Node curr = head;
		Node prev = null;
		Node next = null;
		int count = 0;

		// Reverse the first 'k' nodes
		while (curr != null && count < k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}

		// After reversing, next is now the (k+1)th node,
		// so we recursively reverse the remaining list
		if (next != null) {
			head.next = reversekgroup(next, k);
		}

		// prev is now the head of the reversed list
		return prev;
	}

	// Method to display the list
	public void display() {
		Node node = head;
		while (node != null) {
			System.out.print(node.value + " -> ");
			node = node.next;
		}
		System.out.println("END");
	}

	// Node class definition
	private class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}
}
