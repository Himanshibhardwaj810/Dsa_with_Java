package Strings;


public class pretty_printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a= 23.465675f;
		//placeholder % this will round off the value 
		System.out.printf("%.3f %n",a);
		
		System.out.printf("%f",Math.PI);
		System.out.println();
		System.out.printf("My name is %s and i am %s %dth sem student %n","himanshi","btech",5 );
        
		System.out.println('a'+'b');//this will convert char to ascii value
		System.out.println("a"+"B");
		System.out.println("a"+1);
		System.out.println((char)('a'+3));
		System.out.println("a"+'z');
	}

}
