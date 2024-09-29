package recursion;

public class factorial_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}
	static int fact(int n) {
		if(n<=1) {
			return 1; //as fact of 0 and 1 is 1
		}
		return n*fact(n-1);
	}

}
