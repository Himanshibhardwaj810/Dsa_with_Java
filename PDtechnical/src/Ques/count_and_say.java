package Ques;

import java.util.Arrays;

public class count_and_say {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		for (int i = 1; i <= n; i++) {
			System.out.println("Term " + i + ": " + countandsay(i));
		}

	}
	static String countandsay(int n) {
		if (n == 1) {
			return "1";
		}
		String prevterm=countandsay(n-1);
		int count = 1;
		String ans = "";
		int i;
		for ( i = 0; i < prevterm.length() - 1; i++) {
			if (prevterm.charAt(i) == prevterm.charAt(i + 1)) {
				count++;

			} else {
				ans += count;
				ans += prevterm.charAt(i);
				count=1;

			}
		}
		ans += count;
		ans += prevterm.charAt(i);
	

		return ans;

	}

}
