package if_else_and_conditionals;

import java.util.Scanner;
public class conditionals_questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter how many times you want to do ");
		int n= input.nextInt();
		//for loop
		for(int i=1;i<=n;i++) {
			System.out.println("Hello");
		}
		//While loop
		int k=1;
		while(k<5) {
			System.out.println(k*k);
			k++;
		}
		//Do while loop
		int j=1;
		do {
			System.out.println("Himanshi");
			
		}while(j!=1);
		//Largest number
		System.out.println("Enter 1st  no");
		int a=input.nextInt();
		System.out.println("Enter 2nd  no");
		int b=input.nextInt();
		System.out.println("Enter 3rd  no");
		int c=input.nextInt();
		if(a>b&&a>c) {
			System.out.println("largest is a"+a);
		}
		else if(b>a&&b>c) {
			System.out.println("largest is b"+b);
		}
		else {
			System.out.println("largest is b"+c);
			
		}
		//another way
		int max=a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		System.out.println("Another way largest"+max);
		//another method
		int greatest=Math.max(a,(Math.max(b,c)));
		System.out.println("way with method , the greatest number "+greatest);
		
		
	

	}

}
