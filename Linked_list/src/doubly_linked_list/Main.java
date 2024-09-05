package doubly_linked_list;

import custom_LL.Linked_list;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly_ll list = new Doubly_ll();
		// insert to first
		list.InsertFirst(5);
		list.InsertFirst(15);
		list.InsertFirst(25);
		list.InsertFirst(35);
		
		list.display();

	}

}
