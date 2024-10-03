package Strings;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String element="Mam";
		System.out.println(ispalindrome(element));
		

	}
	static boolean ispalindrome(String element) {
		element=element.toLowerCase();
		int start=0;
		int end=element.length()-1;
		while(start<end) {
			if(element.charAt(start)!=element.charAt(end)){
				return false;
				
			}
			start++;
			end--;
		}
		return true;
	}


}
