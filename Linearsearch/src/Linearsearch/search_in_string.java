package Linearsearch;

import java.util.Arrays;

public class search_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Himanshi";
		char find='s';
		System.out.println(search(name,find));
		//to convert the string into char array
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(search2(name,find));

	}
	static boolean search(String name,char search) {
		if(name.length()==0) {
			return false;
		}
		for(int i=0;i<name.length();i++) {
			if(search==name.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	static boolean search2(String name,char search) {
		if(name.length()==0) {
			return false;
		}
		for(char ch: name.toCharArray()) {
			if(search==ch) {
				return true;
			}
		}
		return false;
	}

}
