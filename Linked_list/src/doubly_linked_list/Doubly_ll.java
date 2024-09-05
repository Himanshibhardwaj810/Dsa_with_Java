package doubly_linked_list;

public class Doubly_ll {
	private Node head;
	 
	
	
	
	//Insertion in doubly linked list
	public void InsertFirst(int value) {
		Node node=new Node(value);
		node.next=head;
		node.prev=null;
		//as head can be null
		if(head!=null) {
			head.prev=node;
		}
		head=node;
	}
	//display of doubly linked list
	public void display() {
		Node node=head;
		while(node!=null) {
			System.out.print(node.value+"->");
			node=node.next;
		}
		System.out.println("END");
		
	}
	private class Node{
		int value;
		Node next;
		Node prev;
		
		public Node(int value) {
			
			this.value = value;
		}

		public Node(int value, Node next, Node prev) {
			
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		
	}
	

}
