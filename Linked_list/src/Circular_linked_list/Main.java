package Circular_linked_list;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circular_ll list=new Circular_ll();
		list.insert(5);
		list.insert(15);
		list.insert(25);
		list.insert(35);
		
		list.display();
		list.delete(25);
		list.display();
		
	}

}
