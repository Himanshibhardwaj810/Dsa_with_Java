package functions;

import java.util.Arrays;

public class Pass_by_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Himanshi";
		mygreet(name);
		System.out.println(name);
		 int a=5;
		int b=3;
		swap(a,b);
		System.out.println(a+" , "+b);
		
		int[] arr= {1,2,3,4,5};
		changearr(arr);
		System.out.println(Arrays.toString(arr));
		
	

	}
	static void mygreet(String name) {
		name="Chetna";//Create a new object for naam
		int a=45;
		int b=758;
		{
			int c=45;//this will have a scope in the block as it is initialised
			a=45;//as it is initialised outside the block so it will have a block
		}
		
		
//		System.out.println(name);
	
	}
	
	static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;//the scope of a and b is valid in this scope only
	}
	
	static void changearr(int[] nums) {
		nums[0]=99;
		nums[3]=52;//we are modifying the value
		
	}

}
