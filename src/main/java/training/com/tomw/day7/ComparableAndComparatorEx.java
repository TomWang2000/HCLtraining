package training.com.tomw.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class ComparableAndComparatorEx {

	public static void main(String[] args) {

		Employee e1 = new Employee("E102", "Name1", "R&D", 30);
		Employee e2 = new Employee("E103", "Name3", "HR", 25);
		Employee e3 = new Employee("E101", "Name2", "IT", 35);

		List<Employee> empList = new ArrayList<>();

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		for (Employee e : empList) {
			System.out.println(e.getId() + " " + e.getName() + " " + e.getDept() + " " + e.getAge());
		}

		Collections.sort(empList);

		Collections.sort(empList, new AgeComparator());

		System.out.println("After sorting...");

		for (Employee e : empList) {
			System.out.println(e.getId() + " " + e.getName() + " " + e.getDept() + " " + e.getAge());
		}
		System.out.println(e1.compareTo(e2));
	}

}

@Setter
@Getter
@AllArgsConstructor
class Employee implements Comparable<Employee> {

	private String id;

	private String name;

	private String dept;

	private int age;

	@Override
	public int compareTo(Employee e) {
		return this.name.compareTo(e.getName());
		// return this.id.compareTo(e.getId());
	}

}

class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getAge() > e2.getAge()) {
			return 1;
		}
		if (e1.getAge() < e2.getAge()) {
			return -1;
		}
		return 0;
	}

}

class DeptComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getDept().compareTo(e2.getDept());
	}

}
