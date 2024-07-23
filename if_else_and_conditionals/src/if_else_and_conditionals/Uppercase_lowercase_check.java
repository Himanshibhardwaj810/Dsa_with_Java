package if_else_and_conditionals;

import java.util.Scanner;


public class Uppercase_lowercase_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//Uppercase lowercase letter
		char a=input.next().trim().charAt(0);
		//char b=input.next().trim().charAt(0);
		if(a>='A'&& a<='Z' ) {
			System.out.println("uppercase letter");
		}
		else {
			System.out.println("Lowercase letter");
		}
		
		

	}

}
