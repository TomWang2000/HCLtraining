package training.com.tomw.day7;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSerEx {

	public static void main(String[] args) {

		Set<String> animals = new LinkedHashSet<>();

		animals.add("dog");
		animals.add("cat");
		animals.add("dolphin");

		for (String animal : animals) {
			System.out.println(animal);
		}

		animals.remove("cat");

		Iterator<String> itr = animals.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
