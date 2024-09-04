package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1=Singleton.getinstance();
		Singleton obj2=Singleton.getinstance();
		Singleton obj3=Singleton.getinstance();
		
		//all three ref variable are pointing to same object

	}

}
