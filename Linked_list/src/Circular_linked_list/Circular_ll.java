package Circular_linked_list;

public class Circular_ll {
	private Node head;
	private Node tail;
	 int size;
	

	public Circular_ll() {
		this.head = null;
		this.tail = null;
		this.size = 0; 
	}

	// insertion in circular linked list
	public void insert(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
			size++;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
		size++;
	}
	//insertion at first index
	public void insertfirst(int value) {
		Node node=new Node(value);
		if(head==null) {
			head=node;
			tail=node;
			return;
		}else {
			node.next=head;
			head=node;
			tail.next=head;
		}
		size++;
	}
	//insert at last
	public void insertlast(int value) {
		Node node=new Node(value);
		if(tail==null) {
			tail=node;
			size++;
			return;
		}
		tail.next=node;
		node.next=head;
		tail=node;
		size++;
		
	}
	//Insertion at particular index
	public void insertatIndex(int index,int value) {
		Node node=new Node(value);
		if(index==0) {
			insertfirst(value);
			return;
		}
		if(index==size) {
			insertlast(value);
			return;
		}
		Node temp=head;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;	
		size++;
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
	//deletion
	public void delete(int value) {
		Node node=head;
		if(node==null) {
			return;
		}
		if(node.value==value) {
			head=head.next;
			tail.next=head;
			size--;
			return;
		}
		do {
			//this n signifies node to delete
			Node n=node.next;//node is prev and n is after that
		    if(n.value==value) {
		    	node.next=n.next;
		    	size--;
		    	break;
		    }
		    node=node.next;
		}while(node!=head);
		
		
	}
	//deletion at first index
	public void deletefirst() {
		if(head==null) {
			System.out.println("Linked list is empty");
		}
		tail.next=head.next;
		head=head.next;
		size--;
	}
	//delete last
	public void deletelast() {
		if(tail==head) {
			deletefirst();
		}
		Node node=head;
		while(node.next!=tail) {//to go one less than tail
			node=node.next;
		}
		node.next=head;
		tail=node;
		size--;
		
	}
	//delete at particular index
	public void delatindex(int index) {
		if(index==0) {
			deletefirst();
			return;
		}
		if(index==size) {
			deletelast();
		}
		Node node=head;
		for(int i=0;i<index-1;i++) {
			node=node.next;
		}
		node.next=node.next.next;
		size--;
	}

	private class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

	}

}
