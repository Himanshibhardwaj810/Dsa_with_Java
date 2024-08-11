package Strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="kunal";
		String b="kunal";
		if(a==b) {
			System.out.println(true);
		}
		String name1=new String("kunal");
		String name2=new String("kunal");
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));//it compare values

	}

}
