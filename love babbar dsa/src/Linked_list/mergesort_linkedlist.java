package Linked_list;

public class mergesort_linkedlist {
	Node head;
	private Node tail;
	private  int size;
	
	public mergesort_linkedlist() {
		this.size = 0;
	}
//MERGE SORT LINKED LIST
	
	//find the middle of the list
	static Node findmiddle(Node head) {
		if(head==null ) {
			return head;
		}
		
		Node slow=head;
		Node fast=head;
      
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	//function to merge two already sorted list
	static Node mergesorted(Node left,Node right) {
		//if left list or right list is empty
		if(left==null) {
			return right;
		}
		if(right==null) {
			return left;
		}
		//to store the result;
		Node res;
		if(left.value<=right.value) {
			res=left;
			res.next=mergesorted(left.next,right);
		}else {
			res=right;
			res.next=mergesorted(left,right.next);
		}
		return res;
	}
	//to sort the list main working
	static Node mergeSort(Node head) {
		//if there is only one element or head is null
		if(head==null || head.next==null) {
			return head;
		}
		Node mid=findmiddle(head);
		//finding the next node of the middle 
		Node nexttomid=mid.next;
		
		//break the linked list into two halves
		mid.next=null;
		
		Node left=mergeSort(head);
		Node right=mergeSort(nexttomid);
		return mergesorted(left,right);
		

		
	}
	//insertion
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
	
	// Method to display the list
	public  void display() {
		Node node = head;
		while (node != null) {
			System.out.print(node.value + " -> ");
			node = node.next;
		}
		System.out.println("END");
	}

	private class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
			this.next=null;
		}
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        mergesort_linkedlist list = new mergesort_linkedlist();

        // Inserting nodes
        list.insert(3);
        list.insert(5);
        list.insert(4);
        list.insert(2);
        list.insert(1);

        // Display before sorting
        System.out.println("Original List:");
        list.display();

        // Sorting the list
        list.head = mergeSort(list.head);

        // Display after sorting
        System.out.println("Sorted List:");
        list.display();
	}

}
