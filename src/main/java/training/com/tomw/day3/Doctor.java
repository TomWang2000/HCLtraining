package training.com.tomw.day3;
/*
 * This is a super class now
 */
public class Doctor {
	
	private String name;
	
	private int age;
	
	public void getDetails() {
		System.out.println(name + " " + age);
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
	
	
	
}
