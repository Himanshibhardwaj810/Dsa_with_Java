package Linked_list;

public class find_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicates_code list=new duplicates_code();
        // Inserting nodes
        list.insert(2);
        list.insert(5);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        list.duplicates();
        list.display();
        list.unsorted_duplicates();
        list.display();
        

	}

}
