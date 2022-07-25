package training.com.tomw.day5;

public class LombokTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("emp1");
		e.setEmpId(101);
		
		Employee e1 = new Employee("emp2", 102);
		
		System.out.println(e1.toString());
		
		Employee e2 = Employee.builder().empId(103).name("emp3").build();
		
		System.out.println(e2);
	}

}
