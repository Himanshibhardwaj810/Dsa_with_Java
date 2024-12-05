package Circular_linked_list;

public class Circular_ll_practice {
	Node head;
	Node tail;
	int size;
	// Insertion at particular index
	public void insert(int value,int index) {
		Node node=new Node(value);
		if(index==0) {
			if(head==null) {
				head=node;
				tail=node;
				size++;
				return;
			}
			node.next=head;
			tail.next=node;
			head=node;
			size++;
			return;
		}
		if(index==size) {
			if(tail==null) {
				tail=node;
				head=node;
				size++;
				return;
			}
			tail.next=node;
			node.next=head;
			tail=node;
			size++;
			return;
		}
		Node temp=head;
		if(temp!=null) {
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		size++;
		return;
		}
	}
	//display
	public void display() {
//		if(head!=null) {
//			System.out.println("empty");
//			return;
//		}
		Node temp=head;
		
		do {
			System.out.println(temp.value+" ");
			temp=temp.next;
		}while(temp!=head);
	
	}
	//deletion
	public void delatindex(int index) {
		if(index==0) {
			if(head!=null) {
				
				tail.next=head.next;
				head=head.next;
				size--;
			}
		}
		if(index==size-1) {
			if(tail!=null) {
				Node node=head;
				while(node.next!=tail) {
					node=node.next;
				}
				node.next=head;
				tail=node;
				size--;
				
			}
		}
		Node prev=head;
		for(int i=0;i<index-1;i++) {
			prev=prev.next;
		}
		prev.next=prev.next.next;
		size--;
		
		
	}
	
	
	
	
	
	
	public class Node{
		int value;
		Node next;
		public Node(int value) {
			super();
			this.value = value;
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circular_ll_practice list=new Circular_ll_practice();
		list.insert(10,0);
		list.insert(20,1);
		list.insert(30, 2);
		list.display();
		list.insert(40,1);
		list.display();
		list.delatindex(2);
		System.out.println("hk");
		list.display();
		

	}

}
