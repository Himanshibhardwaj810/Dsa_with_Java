package doubly_linked_list;



public class Doubly_ll {
	private Node head;
	private Node tail;

	// Insertion in doubly linked list
	//at first index
	public void InsertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		// as head can be null
		if (head != null) {
			head.prev = node;
		}
		head = node;
	}
	//at last index
	public void Insertlast(int value) {
		Node node=new Node(value);
		
		node.next=null;
		node.prev=tail;
		if(tail==null) {
			 InsertFirst(value);
		}else {
	    tail.next=node;
		
		tail=node;
		}
	}
	//2nd method of inserting at last withoud tail
	public void Insertlast2(int value) {
		Node node=new Node(value);
		
		if(head==null) {
			node.prev=null;
			head=node;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		node.next=null;
		node.prev=temp;
		temp.next=node;
		
		
	}
	//after particular node
	public void atindex(int after,int value ) {
		Node prev=find(after);
		
		if(prev==null) {
			System.out.println("doesn't exist");
			return;
		}
		Node node= new Node(value);
		node.next=prev.next;
		node.prev=prev;
		prev.next=node;
		if(node.next!=null) {
		node.next.prev=node;//as it may be last element then node.nexi is null and null.prev or something will give us null pointer exp
		}
		
		
		
		
	}
	//Deletion
	//at first index
	public void delFirstindex() {
		if(head!=null) {
			head=head.next;
			head.prev=null;
		}
	}
	//at last index
	public void dellast() {
		Node last=head;
		while(last.next!=null) {
			last=last.next;
		}
		while(last.next!=null) {
			System.out.println("jgg");
			last.prev.next=null;
			
		}
	}
	//deletion at particular index
	public void delatindex(int index) {
		Node prev=get(index-1);
		prev.next=prev.next.next;
		prev.next.prev=prev;
		System.out.println(prev.value);
		
	}
	//retrieve the node at a specific index
	public Node get(int index) {
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
		
	}
	//finding particular node
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
	

	// display of doubly linked list
	public void display() {
		Node node = head;
		while (node != null) {
			System.out.print(node.value + "->");
			node = node.next;
		}
		System.out.println("END");

	}

	// display of linked list in reverse
	public void displayreverse() {
//		Node node=head;
//		Node last = null;
//		while (node!= null) {
//			last=node;
//			node=node.next;
//			
//			
//		}
		Node last=head;
		while(last.next!=null) {//for justifying tail
			last=last.next;
		}
		System.out.println("Printing in reverse");
		while (last != null) {
			
			System.out.print(last.value + "->");
			last = last.prev;
			
		}
		System.out.println("Start");
	}

	private class Node {
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
