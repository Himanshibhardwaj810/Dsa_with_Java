package if_else_and_conditionals;

public class conditionals {
	public static void main(String[] args) {
	int salary = 54545;
	if(salary>10000) {
		salary=salary + 2000;
		System.out.println(salary);
	}
	else if(salary>20000) {
		salary+=3000;
		System.out.println(salary);
		
	}
	else {
		salary=salary+1000;
		System.out.println(salary);
		
	}

}
}