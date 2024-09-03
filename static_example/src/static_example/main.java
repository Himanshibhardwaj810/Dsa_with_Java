package static_example;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//no need to import as classes are  in same package
		human kunal=new human(45,true,"kunal");
		human dev=new human(45,true,"kunal");
		human mhk=new human(45,true,"kunal");
		System.out.println(kunal.name);
		System.out.println(human.population);
		

	}
	static void fun() {
		main msz = new main();
		msz.greeting();
	}

	void greeting() {
		System.out.println("hllo");
	}

}
