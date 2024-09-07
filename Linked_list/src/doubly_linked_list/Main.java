package doubly_linked_list;

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
		list.Insertlast(45);
		list.display();
		list.Insertlast2(145);
		list.display();
		list.displayreverse();
		//after particular node
		list.atindex(145, 1000);
		list.display();
		//deletION
		list.delatindex(2);
		list.display();

	}

}
