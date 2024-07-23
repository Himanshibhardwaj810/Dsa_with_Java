package arraylist;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList(5);
		list.add(12);
		list.add(45);
		list.add(54);
		list.add(54);
		System.out.println(list);
		list.set(0, 423);
		System.out.println(list);
		System.out.println(list.contains(45));
		list.remove(2);
		System.out.println(list);
		
		//input
		 Scanner in=new Scanner(System.in);
		 ArrayList<Integer> list1=new ArrayList(5);
		 for(int i=0;i<5;i++) {
			 list.add(in.nextInt());
		 }
		 
		 //to get an element from index
		 for(int i=0;i<5;i++) {
			 System.out.println(list.get(i));//list[i] doesn't work
		 }

	}

}
