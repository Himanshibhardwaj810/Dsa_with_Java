package singleton;

public class Singleton {

	 private Singleton(){//constructor private so that you can not access it using another file
		
	}
	 static private Singleton instance;
	 public static Singleton getinstance() {
		 //check whether instance is created or not
		 if(instance==null) {
			 instance=new Singleton();
		 }
		 return instance;
	 }

}
