package recursion;

public class print_Nto1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		fun(5);
//		System.out.println("hlo");
//		funrev(5);
//		System.out.println("both");
		funboth(5);

	}
	static void fun(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		fun(n-1);
	}
	
	static void funrev(int n) {
		if(n==0) {
			return;
		}
		fun(n-1);
		System.out.println(n);
	}
	
	static void funboth(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		funboth(n-1);
		System.out.println(n);
	}
	//space complexity=o(n)

}
