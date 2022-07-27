package training.com.tomw.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();

		animals.add("dog");
		animals.add("cat");
		animals.add("dolphin");

		ListIterator<String> itr = animals.listIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
