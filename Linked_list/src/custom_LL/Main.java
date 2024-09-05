package custom_LL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for creating new linked list
		Linked_list list = new Linked_list();
		// insert to first
		list.InsertFirst(5);
		list.InsertFirst(15);
		list.InsertFirst(25);
		list.InsertFirst(35);
		// to insert last
		list.Lastindex(66);
//		System.out.println(Linked_list.size);
		// at particular index
		list.atindex(29, 3);
		// to display
		list.display();
		// delete first index
		System.out.println(list.deletefirst());
		// to display
		list.display();
		System.out.println(list.get(3));
		System.out.println(list.deletelast()+"sdd");
		// to display
		list.display();
		//at particular index
		System.out.println(list.delatindex(2));
		// to display
		list.display();
		list.InsertFirst(15);
		list.InsertFirst(25);
		list.InsertFirst(35);
		list.display();
		//find the node having value
		System.out.println(list.find(25));
		list.display();
//		System.out.println(list.deletelast2());
//		// to display
//		list.display();
		

	}

}
