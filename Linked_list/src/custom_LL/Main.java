package custom_LL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for creating new linked list
		Linked_list list=new Linked_list();
		//insert to first
		list.InsertFirst(5);
		list.InsertFirst(15);
		list.InsertFirst(25);
		list.InsertFirst(35);
		//to insert last
		list.Lastindex(66);
//		System.out.println(Linked_list.size);
		//at particular index
		list.atindex(29, 3);
		
		//to display
		list.display();

	}

}
