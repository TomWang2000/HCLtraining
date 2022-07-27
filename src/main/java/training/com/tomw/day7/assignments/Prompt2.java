package training.com.tomw.day7.assignments;

import java.util.Comparator;
import java.util.Stack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Prompt2 {

	public static void main(String[] args) {
		
		Person Tommy = new Person("Tommy", 21);
		Person Adam = new Person("Adam", 5000);
		Person Eve = new Person("Eve", 5000);
		Person Ashley = new Person("Ashley", 19);
		
		Stack<Person> pStack = new Stack<>();
		AgeComparator ageC = new AgeComparator();
		
		pStack.add(Tommy);
		pStack.add(Adam);
		pStack.add(Eve);
		pStack.add(Ashley);
		
		for(Person p : pStack) {
			System.out.println(p.getName() + " " + p.getAge());
		}
		System.out.println("Using Comparable for comparing Ashley to Eve...");
		System.out.println("Value: " + Ashley.compareTo(Eve));
		System.out.println("Using Comparator for comparing Adam and Eve's age...");
		if(ageC.compare(Adam, Eve) == 1) {
			System.out.println("Adam is older than Eve");
		}
		else if (ageC.compare(Adam, Eve) == -1) {
			System.out.println("Eve is older than Adam");
		}
		else {
			System.out.println("They are both the same age!");
		}
	}

}

@Setter
@Getter
@AllArgsConstructor
class Person implements Comparable<Person> {

	private String name;

	private int age;
	

	@Override
	public int compareTo(Person e) {
		return this.name.compareTo(e.getName());
		
	}

}

class AgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if (p1.getAge() > p2.getAge()) {
			return 1;
		}
		else if (p1.getAge() < p2.getAge()) {
			return -1;
		} else {
			return 0;
		}
	}

}