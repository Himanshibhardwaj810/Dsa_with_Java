package oops;

public class Constructor_initialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Ravi = new Employee("Ravi", 54);
		Employee Rahul = new Employee("Rahul", 5411);
//		Employee random = new Employee(Rahul);
//		System.out.println(random.name);

	}

}

class Employee {
	String name;
	int id;

	Employee() {
		this.name = "un";
		this.id = 78;
	}

//	Employee(Employee other){
//		this.name=other.name;
//		this.id=other.id;
//	}

//we can initialize as many objects with this method
	Employee(String naam, int id) {
		this.name = naam;
		this.id = id;
	}
}
