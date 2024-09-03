package singleton;

public class Singleton {

	 private Singleton(){//constructor private so that you can not access it using another file
		
	}
	 static private Singleton instance;
	 public Singleton getinstance() {
		 //check whether instance is cteated or not
		 if(instance==null) {
			 instance=new Singleton();
		 }
		 return instance;
	 }

}
