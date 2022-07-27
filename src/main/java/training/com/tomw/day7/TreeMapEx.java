package training.com.tomw.day7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang3.ObjectUtils;

public class TreeMapEx {

	public static void main(String[] args) {

		Employee e1 = new Employee("E101", "EMP1", 2500.00);
		Employee e2 = new Employee("E102", "EMP2", 3000.00);
		Employee e3 = new Employee("E103", "EMP2", 2550.00);

		Map<String, Employee> emps = new TreeMap<>();

		emps.put("E101", e1);
		emps.put("E102", e2);
		emps.put("E103", e3);
		//emps.put(null, null);

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