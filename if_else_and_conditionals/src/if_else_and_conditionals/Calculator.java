package if_else_and_conditionals;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int ans=0;
		//if user enter X or x then terminate
		while(true) {
			System.out.println("enter character");
		char opr=in.next().trim().charAt(0);
		if(opr=='+' || opr=='-'|| opr=='*' || opr=='%' || opr=='/') {
			System.out.println("enter two no");
			 int a=in.nextInt();
			 int b= in.nextInt();
			  if(opr=='+') {
				  ans=a+b;
				  System.out.println(ans);
			  }
			  if(opr=='-') {
				  ans=a-b;
				  System.out.println(ans);
			  }
			  if(opr=='*') {
				  ans=a*b;
				  System.out.println(ans);
			  }
			  if(opr=='/') {
				  if(b!=0) {
				  ans=a/b;
				  
				  System.out.println(ans);
				  }
			  }
			  if(opr=='%') {
				  ans=a+b;
				  System.out.println(ans);
			  }
			  
			  
		}
		else if(opr=='X'|| opr=='x') {
				  break;
			  }
			  else {
				  System.out.println("Invalid opr");
			  }
		
		
		}
		

	}
}

