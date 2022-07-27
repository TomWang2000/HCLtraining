package training.com.tomw.day7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {

		List<String> animals = new LinkedList<>();

		animals.add("dog");
		animals.add("cat");
		animals.add("dolphin");

		for (String animal : animals) {
			System.out.println(animal);
		}

		animals.remove(1);

		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}

		Iterator<String> itr = animals.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
