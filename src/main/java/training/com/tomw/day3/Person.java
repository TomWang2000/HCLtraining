package training.com.tomw.day3;

/*
 * This has constructor overloading. Constructors with different param
 */

public class Person {
	
	/*private Person() {
		This would restrict Person() in ClassAndObjEx
	}*/
	
	private String name = null; //default assigned to null
	
	private int age; //default assigned to zero
	
	private Person person = null;
	
	Person() { //Default constructor
		System.out.println("Executing default constructor");
		name = "test";
		age = 20;
	}
	
	Person(String name, int age) { //Param constructor
		System.out.println("Executing param constructor");
		this.name = name;
		this.age = age; 
	}
	
	Person(String name) { //Param constructor
		System.out.println("Executing name param constructor");
		this.name = name;
	}
	
	Person(Person person) { //Copy constructor
		System.out.println("Executing copy constructor");
		this.name = person.getName();
		this.age = person.getAge();
	}
	
	public void getDetails() {
		System.out.println(getName() + " " + getAge());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("eating...");
	}
	public void sleep() {
		System.out.println("sleeping...");
	}
}
