package recursion;

public class product_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitproduct(505));

	}
	static int digitproduct(int n) {
		if(n%10==n) {
			return n;
		}
		return n%10*digitproduct(n/10);
	}

}
