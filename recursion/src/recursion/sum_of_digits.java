package recursion;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitsum(4532));

	}
	static int digitsum(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+digitsum(n/10);
	}

}
