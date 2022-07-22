package training.com.tomw.day3.assignments;

public class Prompt3 {

	private String name;

	private int age;

	private Prompt3 teacher = null;

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

	public Prompt3 getTeacher() {
		return teacher;
	}

	public void setTeacher(Prompt3 teacher) {
		this.teacher = teacher;
	}

	public void getDetails() {
		System.out.println(getName() + " " + getAge());
	}

	Prompt3() {
		System.out.println("Default Constructor");
		name = "Ms. Janet";
		age = 25;
	}

	Prompt3(String name, int age) {
		System.out.println("Param Constructor");
		this.name = name;
		this.age = age;
	}

	Prompt3(Prompt3 teacher) {
		System.out.println("Copy Constructor");
		this.name = teacher.getName();
		this.age = teacher.getAge();
	}

	public static void main(String args[]) {
		Prompt3 teacher1 = new Prompt3();
		teacher1.setName("Mr. Joe");
		teacher1.setAge(45);
		teacher1.getDetails();

		Prompt3 teacher2 = new Prompt3("Ms. Poly", 53);
		System.out.println(teacher2.getName() + " " + teacher2.getAge());

		Prompt3 teacher3 = new Prompt3(teacher2);
		System.out.println(teacher3.getName() + " " + teacher3.getAge());
	}
}
