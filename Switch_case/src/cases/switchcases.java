package cases;

import java.util.Scanner;

public class switchcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//		String fruits= input.next();
//		switch(fruits) {
//		case "Apple" -> System.out.println("Apple");
//		case "grapes" -> System.out.println("grape");
//		case "orange" -> System.out.println("orange");
//		default -> System.out.println("invalid");
//			
//		int day=input.nextInt();
//		switch(day) {
//		case 1,2,3,4,5 -> System.out.println("tuesday");
//		
//		case  6,7-> System.out.println("sunday");
//		
//		
//		}
		int empid = input.nextInt();
		String dept = input.next();
		System.out.println("enter emp id");
		switch (empid) {
		case 1:
			System.out.println("mehak");
			break;

		case 2:
			System.out.println("Manish");
			break;
		case 3:
			System.out.println("employee department");
			switch (dept) {
			case "IT" -> System.out.println("IT");
			case "mgmt" -> System.out.println("mgmt");
			default -> System.out.println("no department entered");

			}
			break;
		default:
			System.out.println("enter valid emp id");

		}

	}

}
