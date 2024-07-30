package Ques;

public class countsay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for (int i = 1; i <= n; i++) {
			String output = countAndSay(i);
			System.out.println("Term " + i + ": " + countAndSay(i));
		}

	}

	static String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		String previousTerm = countAndSay(n - 1);
		int count = 0;
		char prev = '0';
		String ans = "";
		for (int i = 0; i < previousTerm.length(); i++) {
			if (previousTerm.charAt(i) == prev) {
				count++;
			} else {
				if (count != 0) {
					ans += count + 0;
					ans += prev;
				}
				prev = previousTerm.charAt(i);
				count = 1;
			}
		}
		if (count != 0) {
			ans += count + 0;
			ans += prev;
		}
		return ans;
	}
}
