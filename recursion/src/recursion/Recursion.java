package recursion;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//program to print 1 to 5 numbers
		print1(1);
		//with recursion
		print(1);
	}
	static void print1(int n) {
		System.out.println(n);
		print2(2); //as all the functions have same definition and body
	}
	static void print2(int n) {
		System.out.println(n);
		print3(3);
	}
	static void print3(int n) {
		System.out.println(n);
		print4(4);
	}
	static void print4(int n) {
		System.out.println(n);
		print5(5);
	}
	static void print5(int n) {
		System.out.println(n);
	}
	//using recursion
	static void print(int n) {
		if(n==5) {
			System.out.println(n);
			return;
		}
		
		System.out.println(n);
		print(n+1);
	}

}
