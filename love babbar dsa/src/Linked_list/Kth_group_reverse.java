package Linked_list;

public class Kth_group_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k_list list=new k_list();
		list.insert(1);
		list.insert(2);
		list.insert(2);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.display();
		int k=4;
		list.head=list.reversekgroup(list.head,k);
		list.display();

	}

}
