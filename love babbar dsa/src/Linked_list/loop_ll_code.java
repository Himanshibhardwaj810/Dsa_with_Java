package Linked_list;

public class loop_ll_code {
	Node head;
	private Node tail;
	private int size;

	public loop_ll_code() {
		this.size = 0;

	}
    // Insertion
    public void insert(int value) {
        Node node = new Node(value);
        if (tail == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // Display
    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }
    //detection of loop
	public boolean detectloop(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return true;
			}
		}
			return false;
	}
	// Finding starting node of loop
	public Node findloopstart(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				break;
			}
		}
		 // If fast reached the end or next is null, it means no loop
		if(fast==null && fast.next==null) {
		return null;//no loop detected
		}
		slow=head;
		while(slow!=fast) {
			slow=slow.next;
			fast=fast.next;
		}
		//Both pointers meet at the start of the loop
		return slow;//start of loop
			
	}
	//removal of loop
	public void removeloop(Node head) {
		Node loopstart=findloopstart(head);
		if(loopstart==null) {
			return;//no loop found
		}
		Node temp=loopstart;
		while(temp.next!=loopstart) {
			temp=temp.next;
		}
		temp.next=null;
	}

 
	 // To create a loop for testing purposes
    public void createLoop(int position) {
        if (position == 0) return;

        Node temp = head;
        Node loopNode = null;
        int currentPos = 1;

        // Traverse the list to find the node where the loop starts
        while (temp.next != null) {
            if (currentPos == position) {
                loopNode = temp;
            }
            temp = temp.next;
            currentPos++;
        }
        // Creating a loop by connecting the last node to the loopNode
        temp.next = loopNode;
    }


	public class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}

}


