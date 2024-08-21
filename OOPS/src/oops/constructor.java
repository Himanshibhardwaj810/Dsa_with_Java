package oops;

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee Rahul = new Employee("Rahul",54);
		 Employee Rahul111 = new Employee("Rahul11",5411);
		 
		 Rahul.greeting();
			Employee random = new Employee(Rahul);
			System.out.println(random.name);
		Employee constructor=new Employee();
		//calling one constructor from another
		System.out.println(constructor.name);
		//as both point to same object in heap memomry
		Employee one=new Employee();
		Employee two=one;
		one.name="something";
		System.out.println(two.name);


	}
}

	class Employee {
		String name;
		int id;


		Employee(String naam, int id) {
			name = naam;
			this.id = id;
		}
		//yopu can initialize with class datatype
		Employee(Employee other){
		this.name=other.name;
		this.id=other.id;
	}

		void changeName(String newname) {
			name=newname;
		}
		void greeting() {
			System.out.println("hello"+name);
		}
		//if you want to call constructor from another constructor
		Employee(){
			//internally :Employee(String naam,int id)
			this("dev",29);
		}
	

}
