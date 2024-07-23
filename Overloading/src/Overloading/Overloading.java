package Overloading;

public class Overloading {

	public static void main(String[] args) {
		fun(45);
		System.out.println(sum(45,450));
	System.out.println(sum(12,45,21));
		
		// TODO Auto-generated method stub

	}
	static void fun(int a ) {
		System.out.println(a);
		
	}
	static void fun(int name,int b) {
		System.out.println(name);
		
	}
	
	static int sum(int a,int  b) {
		return a+b;
	}
	static int sum(int a,int b,int c) {
		return a+b+c;
	}

}
