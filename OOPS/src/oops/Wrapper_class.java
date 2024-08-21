package oops;

public class Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		// wrapper class adds more functionality
		Integer num1 = 10;
		Integer num2 = 90;
		swap(num1, num2);
		System.out.println(num1);
		System.out.println(num2);
		//final for non-primitives they can be modified but cant reassign
		final a obj=new a("kunal");
		obj.name="hima";
//		A hima=obj;
		//finalize method is called
		a brand;
		for(int i=1;i<=10000000;i++) {
			brand=new a("hima");
		}

	}

	static void swap(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}

	
	

}


class a {
	String name;

	a(String name) {
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("object is destroyed");
	}

}
