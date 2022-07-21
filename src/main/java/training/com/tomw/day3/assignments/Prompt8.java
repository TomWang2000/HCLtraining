package training.com.tomw.day3.assignments;

final class Person2 {
	
	final protected String name = "Ashley";
	
	final protected int age = 16;
	
	final public void printMethod() {
		System.out.println("This is from super class");
	}
	Person2(){
		System.out.println("This is the super class constructor");
	}
}

/* class Student1 extends Person2{ This class gets an error from the final key word on the superclass Person2
	
	private String year;
	
	public void printMethod() {
		// super.printMethod(); This gets an error from the final keyword in the superclass method printMethod()
		System.out.println("This is from subclass");
	}
	
	Student1() {
		super();
		System.out.println("This is the sub class constructor");
	}
	
	void getDetails1() {
		// System.out.println(super.name); This gets an error from final keyword on variable name
		// System.out.println(super.age); This gets an error from final keyword on variable age
		System.out.println(year);
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
*/
public class Prompt8 {
	
	public static void main(String args[]) {
		Student stud = new Student();
		stud.setYear("Sophomore");
		stud.getDetails1();
		stud.printMethod();
	}
}