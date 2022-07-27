package training.com.tomw.day7;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		Stack<String> animals = new Stack<>();
		
		animals.push("dog");
		animals.push("cat");
		animals.push("dolphin");
		
		System.out.println(animals);
		
		System.out.println(animals.peek());
		System.out.println(animals.peek());
		
		System.out.println(animals.pop());
		System.out.println(animals.pop());
		
		System.out.println(animals);
		
	}

}
