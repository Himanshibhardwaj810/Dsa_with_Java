package Linked_list;


public class rotatae_doubly_linked_list {
	Node head;
	Node tail;
	int size;
	

	
	public rotatae_doubly_linked_list() {
		this.size=0;
	}
	
	//reversal in kgroup
	public static Node reversekgroup(Node head,int k) {
		if(head==null || head.next==null) {
			return head;
		}
		
		Node curr=head;
		Node prev=null;
		Node next=prev;
		int count =0;
		while(curr!=null && count<k) {
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
			count++;
		}
		
		if(next!=null) {
			head.next=reversekgroup(next,k);
		}
		
		return prev;
	}
	
	//insertion at end 
	public void insert(int value) {
		Node node=new Node(value);
		
		if(head==null) {
			head=node;
			size++;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
		node.next=null;
		node.prev=temp;
		size++;
		
	}
	// display of doubly linked list
	public void display() {
		Node node = head;
		while (node != null) {
			System.out.print(node.value + "->");
			node = node.next;
		}
		System.out.println("END");

	}
	private class Node{
		int value;
		Node next;
		Node prev;
		public Node(int value) {
			super();
			this.value = value;
			this.prev=null;
			this.next=null;
		}
		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotatae_doubly_linked_list list=new rotatae_doubly_linked_list();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.display();
		
		int k=2;
		list.head=reversekgroup(list.head,k);
		list.display();

	}

}
