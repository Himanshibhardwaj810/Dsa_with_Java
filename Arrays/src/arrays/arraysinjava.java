package arrays;

import java.util.Scanner;

import java.util.Arrays;

public class arraysinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		
		//array of primitives
		Scanner in=new Scanner(System.in);
		
		int[] arr=new int[5];
		System.out.println("Input");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println((Arrays.toString(arr)));
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		//or shorthand notation
		for(int nums:arr) {
			System.out.print(nums+" ");//here nums represent element of array
		}
		
		//arrays of strings
		String[] name=new String[5];
		for(int i=0;i<name.length;i++) {
			name[i]=in.next();
		}
		System.out.println(Arrays.toString(name));
		
		
		
		
		


	}

}
