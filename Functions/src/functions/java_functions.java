package functions;

import java.util.Scanner;

public class java_functions {
	public static void main(String[] args) {
		 int ans=sum();
		 System.out.println(ans);
		
		 greeting();
		 System.out.println(greet());
		 int res=sum2(545,452);
		 System.out.println(res);
		 
		 
		 
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter name");
		 String name=in.next();
		 System.out.println(mygreet(name));
		 
	}
	/*
	 * access modifier return type name (){
	 * body
	 * return statement
	 * }
	 */
	 static int sum() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a= in.nextInt();
		int b=in.nextInt();
		int result=a+b;
		return result;
		
	}
	 static int sum2(int a,int b) {
		 int sum=a+b;
		 return sum;
		 
	 }
	 static void greeting() {
		System.out.println("Hello world");
	}
	static String greet() {
		String greeting = "Focus on consistency";
			
		return greeting;
	}
	static String mygreet(String name) {
		String heloo="HEllo"+name;
		return heloo;
		
	}

}
