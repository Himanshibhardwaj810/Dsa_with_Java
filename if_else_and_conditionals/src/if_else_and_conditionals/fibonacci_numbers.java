package if_else_and_conditionals;

import java.util.Scanner;

public class fibonacci_numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("YOu want to find which fibonaaci number ");
		int n= input.nextInt();
		int a=0;//previous number
		int b=1;//current number
		int temp;
		for(int i=2;i<=n;i++) {
			temp=b;
			b=a+b;
			a=temp;
		}
		System.out.println(b);
		
	
	
	}

}
