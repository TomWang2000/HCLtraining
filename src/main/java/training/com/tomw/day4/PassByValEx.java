package training.com.tomw.day4;

public class PassByValEx {

	public static void main(String[] args) {

		Employee ee = new Employee();
		ee.setId(101);
		ee.setName("Emp1");

		EmployeePayroll ep = new EmployeePayroll();
		ep.calcEmpPayRoll(ee);

		System.out.println(ee.getName());
		// int empId = 101;
		// ep.getEmpDet(empId);
		// System.out.println(empId);

	}
}

class Employee {

	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class EmployeePayroll {
	public void calcEmpPayRoll(Employee e) {
		e.setName("emp1");
	}

	public void getEmpDet(int empId) {
		empId = 50;
	}
}
