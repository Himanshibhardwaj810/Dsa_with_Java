package custom_LL;

public class linked_list_practice {
	private Node head;
	private Node tail;
	int size;
	
	public linked_list_practice() {
		this.size=size;
	}
	//insert first
	public void insertfirst(int value) {
		Node node=new Node(value);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=node;
		}
		size++;
		return;
		
		
		
	}
	//insertion at last
	public void insert(int value) {
		Node node=new Node(value);
		if(head==null) {
			head=node;
			tail=node;
		}
		tail.next=node;
		tail=node;
		size++;
	}
	//insertion at particular index
	public void atinsert(int value,int index)
	{
		Node node=new Node(value);
		if(index==0) {
		insertfirst(value);
		}
		if(index==size) {
			insert(value);
			return;
		}
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		size++;
		
	}
	//display
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.value+"->");
			temp=temp.next;
		}
	}
	//delete last
	public int deletelast() {
		if(tail==null) {
			return 0;
		}
		int val=tail.value;
		Node prev=head;
		for(int i=0;i<size-2;i++) {
			prev=prev.next;
		}
		prev.next=null;
		tail=prev;
		size--;
		return val;
	}
	//delete at index
	public int delatindex(int index) {
		if(index==0) {
			return 0;
		}
		if(index==size-1) {
			deletelast();
		}
		Node prev=head;
		for(int i=0;i<index-1;i++)
		{
			prev=prev.next;
		}
		int val=prev.next.value;
		prev.next=prev.next.next;
		size--;
		return val;
	}

	public class Node{
		int value;
		Node next;
		
		
		public Node(int value) {
			this.value = value;
		}


		public Node(int data, Node next) {
			this.value = value;
			this.next = next;
		}
		
		
	
	}








	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linked_list_practice list=new linked_list_practice();
		list.insert(45);
		list.insert(145);
		list.insert(245);
		list.insert(345);
		list.insert(445);
		list.display();
		System.out.println("new");
		list.insertfirst(10);
		list.display();
		System.out.println("new");
		list.atinsert(10,2);
		list.display();
		list.deletelast();
		System.out.println("kjnsi");
		list.display();
		System.out.println("hbbs");
		list.delatindex(2);
		list.display();

	}

}
