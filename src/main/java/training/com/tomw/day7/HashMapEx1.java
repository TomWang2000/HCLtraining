package training.com.tomw.day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;

public class HashMapEx1 {

	public static void main(String[] args) {

		Employee12 e1 = new Employee12("E101", "EMP1", 2500.00);
		Employee12 e2 = new Employee12("E102", "EMP2", 3000.00);
		Employee12 e3 = new Employee12("E103", "EMP2", 2550.00);

		Map<String, Employee12> emps = new HashMap<>();

		emps.put("E101", e1);
		emps.put("E102", e2);
		emps.put("E103", e3);
		emps.put(null, null);

		for (String key : emps.keySet()) {
			Employee12 e = emps.get(key);
			System.out.println(e);
			if (ObjectUtils.isNotEmpty(e)) {
				System.out.println(e.getName());
			}
		}

		for (Map.Entry<String, Employee12> entry : emps.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		for (Employee12 val : emps.values()) {
			if (ObjectUtils.isNotEmpty(val)) {
				System.out.println(val.getName());
			}
		}

		Iterator<Map.Entry<String, Employee12>> itr = emps.entrySet().iterator();
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}

class Employee12 {

	Employee12(String id, String name, double salary) {
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
