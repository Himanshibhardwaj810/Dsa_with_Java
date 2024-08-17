package oops;

import java.util.Arrays;

public class OOPS_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students=new Student[5];
		Student kunal;//here declaring the reference variable of object of datatype student
//		System.out.println(kunal); 
		kunal=new Student();//initialize
		
		
		//in a single line
//		Student kunal =new Student();
//		System.out.println(Arrays.toString(students));
		
		kunal.rollno=45;
		kunal.name="kunal";
		System.out.println(kunal.rollno);
		System.out.println(kunal.name);
		System.out.println(kunal.pass);

	}

}
//for every single student
class Student{
	int rollno;
	String name;
	Float marks;
	boolean pass=true;
}
