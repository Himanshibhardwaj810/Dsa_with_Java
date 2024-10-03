package custom_LL;

import Linked_list.Linked_list.Node;

//singly linked list
public class Linked_list {

	// as every linked list contain head and tail
	private Node head;
	private Node tail;
	private int size;
//	static int size;

	public Linked_list() {

		this.size = 0;
	}

	// Insertion in singly linked list at first index
	public void InsertFirst(int value) {
		// Creating new node
		Node node = new Node(value);
		node.next = head;
		head = node;
		// if single element is there
		if (tail == null) {
			tail = head;
		}
		size++;
	}
	//reversal of singly linked list
	public void reverse() {
		if(head==null || head.next==null) {
			return;
		}
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null) {
			//store the next
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
	    // After the loop, prev will be the new head
	    tail = head; // The old head becomes the new tail
	    head = prev; // The last node becomes the new head
	}
	
	// to display the linked list or traversal
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}

	// Insertion at last index
	public void Lastindex(int value) {
		// if list is empty
		if (tail == null) {
			InsertFirst(value);
			return;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size++;

	}
	// if you are not maintaining tail this is only process doesn't implement
//		while(tail.next==null) {
//			Node node=new Node(value);
//			tail.next=node;
//			tail=node;
//			size++;
//			
//		}

	// Insertion at a particular index
	public void atindex(int value, int index) {
		if (index == 0) {
			InsertFirst(value);
			return;
		}
		if (index == size) {
			Lastindex(value);
			return;
		}
		Node temp = head;
		// for traversing upto the index-1
		for (int i = 1; i < index; i++) {// as i=0 signifies head only
			temp = temp.next;
		}
		Node node = new Node(value, temp.next);
		temp.next = node;// for attaching temp with new node
		size++;
	}

	// deletion in singly linked list
	//at first index
	public int deletefirst() {
		if(head==null) {
//			tail=null;
			return 0;
		}
		if(size<=1) {
			return 0;
		}
		
		int val=head.value;
		head=head.next;
		
		size--;
		return val;
		
	}
	//delete at last index
	ed
	public int deletelast() {
		if(size<=1) {
			deletefirst();
		}
		int val=tail.value;
		Node secondlast=get(size-2);//as index is starting from zero
		tail=secondlast;
		tail.next=null;
		
		return val;
	}
	//retrieve the node at a specific index
	public Node get(int index) {
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
		
	}
	//Delete a particular index
	public int delatindex(int index) {
		if(index==0) {
			deletefirst();
		}
		if(index==size-1) {
			deletelast();
		}
		
		Node prev=get(index-1);
		int val=prev.next.value;
		prev.next=prev.next.next;
		return val;
		
	}
	//finding the particular node having value
	public Node find(int value) {
		Node node=head;
		while(node!=null) {
			if(node.value==value) {
				return node;
			}
			node=node.next;
		}
		return null;
		
	}
	public int deletelast2() {
		if(size<=1) {
			return 0;
		}
		int val=tail.value;
		Node temp=head;
		for(int i=0;i<size-2;i++) {
			temp=temp.next;
			
		}
		tail=temp;
		if(tail!=null) {
		tail.next=null;
		}
		size--;
		return val;
	}
	

//to create new node
	private class Node {
		int value;
		Node next;

		// by default constructor
		public Node(int value) {

			this.value = value;
			this.next=null;
		}

		// user defined constructor
		public Node(int value, Node next) {

			this.value = value;
			this.next = next;
		}

	}
}
