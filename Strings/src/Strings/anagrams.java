package Strings;

import java.util.Arrays;

public class anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="cat";
		String str2="tac";
		System.out.println(anagrams(str1,str2));

	}
	static boolean anagrams(String str1,String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
		char[] charstr1=str1.toCharArray();
		char[] charstr2=str2.toCharArray();
		Arrays.sort(charstr1);
		Arrays.sort(charstr2);
		return Arrays.equals(charstr1,charstr2);
	}

}
