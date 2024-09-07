package Circular_linked_list;

public class Circular_ll {
	private Node head;
	private Node tail;

	public Circular_ll() {
		this.head = null;
		this.tail = null;
	}

	// insertion in circular linked list
	public void insert(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}

	// To display
	public void display() {
		Node node = head;
		if (head != null) {
			do {
				System.out.print(node.value + "->");
				node=node.next;
			} while (node != head);
		}
		System.out.println("Head");
	}
	//deletetion
	public void delete(int value) {
		Node node=head;
		if(node==null) {
			return;
		}
		if(node.value==value) {
			head=head.next;
			tail.next=head;
			return;
		}
		do {
			//this n signifies node to delete
			Node n=node.next;//node is prev and n is after that
		    if(n.value==value) {
		    	node.next=n.next;
		    	break;
		    }
		    node=node.next;
		}while(node!=head);
		
		
	}

	private class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

	}

}
