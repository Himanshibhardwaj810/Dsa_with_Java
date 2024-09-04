package custom_LL;
//singly linked list
public class Linked_list {
	
	//as every linked list contain head and tail
	private Node head;
	private Node tail;
	private int size;
//	static int size;
	
	
	public Linked_list() {
		
		this.size = 0;
	}
	//Insertion in singly linked list at first index
		public void InsertFirst(int value) {
			//Creating new node
			Node node=new Node(value);
			node.next=head;
			head=node;
			//if single element is there
			if(tail==null) {
				tail=head;
			}
			size++;
		}
		//to display the linked list
		public void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.value+"->");
				temp=temp.next;
			}
			System.out.println("END");
		}
		//Insertion at last index
		public void Lastindex(int value) {
			//if list is empty
			if(tail==null) {
				InsertFirst(value);
				return;
			}
			Node node=new Node(value);
			tail.next=node;
			tail=node;
			size++;
			
		}
		//if you are not maintaining tail this is only process doesn't implement
//		while(tail.next==null) {
//			Node node=new Node(value);
//			tail.next=node;
//			tail=node;
//			size++;
//			
//		}
		
		//Insertion at a particular index
		public void atindex(int value,int index) {
			if(index==0) {
				InsertFirst(value);
				return;
			}
			if(index==size) {
				Lastindex(value);
				return;
			}
			Node temp=head;
			//for traversing upto the index-1
			for(int i=1;i<index;i++) {//as i=0 signifies head only
				temp=temp.next;
			}
			Node node=new Node(value,temp.next);
			temp.next=node;//for attachuing temp with new node
			size++;
		}
		
		

//to create new node
	private class Node{
		int value;
		Node next;
		//by default constructor 
		public Node(int value) {
			
			this.value = value;
		}
		
		
	//user defined constructor
	public Node(int value, Node next) {
		
		this.value = value;
		this.next = next;
	}
	
	

}
}
