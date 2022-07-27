package training.com.tomw.day7;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx {

	public static void main(String[] args) {
		
		List animals = new ArrayList();
		
		animals.add("dog");
		animals.add(101);
		animals.add("cat");
		
		System.out.println(animals);
		
		List<String> names = new ArrayList<>();
		names.add("dog");
		//names.add(101);
		names.add("cat");
		
		System.out.println(names);
		
		
		
	}

}
