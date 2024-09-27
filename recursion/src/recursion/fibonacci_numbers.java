package recursion;

public class fibonacci_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = fibo(54);//f(0) =0; so index start from 0
		System.out.println(ans);

	}
	static int fibo(int n) {
		if(n<2) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

}
