package training.com.tomw.day7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;

public class LinkedHashMapEx {

	public static void main(String[] args) {

		Employee e1 = new Employee("E101", "EMP1", 2500.00);
		Employee e2 = new Employee("E102", "EMP2", 3000.00);
		Employee e3 = new Employee("E103", "EMP2", 2550.00);

		Map<String, Employee> emps = new LinkedHashMap<>();

		emps.put("E101", e1);
		emps.put("E102", e2);
		emps.put("E103", e3);
		emps.put(null, null);

		for (String key : emps.keySet()) {
			Employee e = emps.get(key);
			System.out.println(e);
			if (ObjectUtils.isNotEmpty(e)) {
				System.out.println(e.getName());
			}
		}

		for (Map.Entry<String, Employee> entry : emps.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		for (Employee val : emps.values()) {
			if (ObjectUtils.isNotEmpty(val)) {
				System.out.println(val.getName());
			}
		}

		Iterator<Map.Entry<String, Employee>> itr = emps.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

class Employee {

	Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	private String id;

	private String name;

	private double salary;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
