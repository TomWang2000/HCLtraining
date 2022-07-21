package training.com.tomw.day3;

public class ClassAndObjEx {
	
	public static void main(String[] args) {
		Person p1 = new Person(); //Default Constructor
		p1.setName("Tom");
		p1.setAge(20);
		p1.getDetails();
		
		Person p2 = new Person(); //Default Constructor
		p2.setName("Don");
		p2.setAge(26);
		p2.getDetails();
		
		Person p3 = new Person(); //Default Constructor
		System.out.println(p3.getAge());
		System.out.println(p3.getName());
		
		Person p4 = new Person("Name1", 20); //Param Constructor
		System.out.println(p4.getAge());
		System.out.println(p4.getName());
		
		Person p5 = new Person("Chad"); //Param Constructor
		System.out.println(p5.getName());
		System.out.print(p5.getAge());
		
		System.out.println(); 
		Person p6 = new Person("Cory", 30); //Param Constructor
		System.out.println(p6.getName());
		System.out.println(p6.getAge());
		
		Person p7 = new Person(p6); //Copies p6 (copy constructor
		System.out.println(p7.getName());
		System.out.println(p7.getAge());
		
		Employee emp1 = new Employee();
		emp1.setId(0);
		emp1.setName("Dan");
		System.out.println(emp1);
		
		try {
			Employee emp2 = (Employee) emp1.clone();
			System.out.println(emp2.getName());
			System.out.println(emp2.getId());
			System.out.println(emp2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		Employee emp3 = new Employee();
		emp3.setId(4);
		emp3.setName("Ash");
		Department dept = new Department();
		dept.setId(100);
		dept.setName("IT");
		emp3.setDept(dept);
		System.out.println(emp3.getDept().getId());
		System.out.println(emp3.getDept().getName());
		
		try {
			Employee emp4 = (Employee) emp3.clone();
			System.out.println(emp4.getName());
			System.out.println(emp4.getId());
			System.out.println(emp4.getDept().getName());
			System.out.println(emp4);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
