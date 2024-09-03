package static_example;

public class static_block {
	static int a=8;
	static int b=9;
	//it will run only once
	//it shows static block will run till static_block class is loaded
	static {
		System.out.println("in static block");
		b=8*7;
	}
	public static void main(String[] args) {
		static_block obj=new static_block();
		System.out.println(static_block.a+" "+static_block.b);
		b+=3;
		System.out.println(static_block.a+" "+static_block.b);
		static_block obj2=new static_block();
		System.out.println(static_block.a+" "+static_block.b);
		
		
	
	}


}
