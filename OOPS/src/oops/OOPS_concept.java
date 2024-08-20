package oops;

import java.util.Arrays;

public class OOPS_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students=new Student[5];
		Student kunal;//here declaring the reference variable of object of datatype student
//		System.out.println(kunal); 
		kunal=new Student();//initialize
		Student hima=new Student(15,"hima",90);
		System.out.println(hima.name);
		System.out.println(hima.rollno);
		System.out.println(hima.marks);
		//kunal
		System.out.println(kunal.rollno);
		System.out.println(kunal.name);
		//method calling
		kunal.greeting();
		
		
		//in a single line
//		Student kunal =new Student();
//		System.out.println(Arrays.toString(students));
		
//		kunal.rollno=45;
//		kunal.name="kunal";
//		


	}

}
//for every single student
class Student{
	int rollno;
	String name;
	Float marks;
	boolean pass=true;
	
	//constructor 
	Student(){
	this.rollno=45;
	this.name="kunal";
	this.marks=90f;
	}
	Student(int roll,String naam,float marks){
		this.rollno=roll;
		this.name=naam;
		this.marks=marks;
		}
	//method
	void greeting() {
		System.out.println("hello"+name);
	}
	
}
