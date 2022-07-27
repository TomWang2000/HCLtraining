package training.com.tomw.day7;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		PriorityQueue<String> animals = new PriorityQueue<>();
		
		animals.add("dog");
		animals.add("cat");
		animals.add("dolphin");
		
		System.out.println(animals);
		
		System.out.println(animals.peek());
		System.out.println(animals.peek());
		
		System.out.println(animals.poll());
		System.out.println(animals.poll());
		
		System.out.println(animals.element());
		
		System.out.println(animals);
	}

}
