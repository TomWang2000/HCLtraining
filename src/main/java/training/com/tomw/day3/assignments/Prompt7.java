package training.com.tomw.day3.assignments;

class Person1 {
	
	protected String name = "Ashley";
	
	protected int age = 16;
	
	public void printMethod() {
		System.out.println("This is from super class");
	}
	Person1(){
		System.out.println("This is the super class constructor");
	}
}

class Student extends Person1{
	
	private String year;
	
	public void printMethod() {
		super.printMethod();
		System.out.println("This is from subclass");
	}
	
	Student() {
		super();
		System.out.println("This is the sub class constructor");
	}
	
	void getDetails1() {
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(year);
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
public class Prompt7 {
	
	public static void main(String args[]) {
		Student stud = new Student();
		stud.setYear("Sophomore");
		stud.getDetails1();
		stud.printMethod();
	}
}
