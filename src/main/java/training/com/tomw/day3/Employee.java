package training.com.tomw.day3;

public class Employee implements Cloneable{
	
	private String name;
	
	private int id;
	
	private Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
