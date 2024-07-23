package Shadow;

import java.util.Arrays;

public class Varargs {

	public static void main(String[] args) {
		fun(2,3,4,45,4,5,4,52,874,2,45);
		fun("hima","mhk","manish");
		// TODO Auto-generated method stub

	}
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	static void fun(String ...v) {
		System.out.println(Arrays.toString(v));
	}

}
