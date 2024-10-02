package Strings;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="himanshi";
		System.out.println(reverse(str));

	}
	static String reverse(String str) {
		StringBuilder reversed=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

}
