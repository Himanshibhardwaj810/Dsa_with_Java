package static_example;

class test123{
	static String name;//here static is name
	public test123(String name) {
		
		test123.name=name;//here this.name is test123.name
		
		// TODO Auto-generated constructor stub
	}	
}

public class inner_class {
	 static class test{
		String name;
		public test(String name) {
			//here class test is static
			this.name=name;//this.name=a.name
			
			// TODO Auto-generated constructor stub
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test a=new test("hlo");
		test b=new test("hjl");
		System.out.println(a.name);
		System.out.println(b.name);
		
		test123 a1=new test123("kunal");
		test123 b1=new test123("rahul");
		System.out.println(a1.name);
		System.out.println(b1.name);//as last assignment ewas rahul so name has rahul value

	}

}
