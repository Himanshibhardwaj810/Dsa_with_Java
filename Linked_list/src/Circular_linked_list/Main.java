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
		list.insertfirst(32);
		list.display();
		list.insertlast(321);
		list.display();
		System.out.println(list.size);
		list.insertatIndex(3,141);
		list.display();
		list.deletefirst();
		list.display();
		list.deletelast();
		list.display();
		list.delatindex(2);
		list.display();
		
	}

}
