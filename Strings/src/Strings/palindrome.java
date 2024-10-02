package Strings;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String element="mam";
		System.out.println(palindrome(element));
		if(element==palindrome(element)) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		

	}
	static String palindrome(String element) {
		element=element.toLowerCase();
		int start=0;
		int end=element.length()-1;
		while(start<end) {
			if(element.charAt(start)==element.charAt(end)) {	
			start++;
			end--;
			}
		}
		return element;
	}


}
