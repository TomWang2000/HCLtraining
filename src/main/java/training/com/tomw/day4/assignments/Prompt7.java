package training.com.tomw.day4.assignments;

class StrSwapVal {
	String a;
	String b;

	StrSwapVal(String x, String y) {
		a = x;
		b = y;
	}

	void swap(String a, String b) {
		String temp;
		temp = a;
		a = b;
		a = temp;

	}
}

class StrSwapRef {
	String a;
	String b;

	StrSwapRef(String x, String y) {
		a = x;
		b = y;
	}

	void swap(StrSwapRef ref) {
		String temp;
		temp = ref.a;
		ref.a = ref.b;
		ref.b = temp;

	}
}

public class Prompt7 {

	public static void main(String[] args) {
		//Passing by Value does not swap the values of the two strings in the main method. 
		StrSwapVal obj1 = new StrSwapVal("Tommy", "Wang");
		System.out.println("Before: " + obj1.a + " " + obj1.b);
		obj1.swap(obj1.a,obj1.b);
		System.out.println("After: " + obj1.a + " " + obj1.b);
		System.out.println();
		//Passing by Reference swaps the values of the two strings in the main method. 
		StrSwapRef obj2 = new StrSwapRef("Tommy", "Wang ");
		System.out.println("Before: " + obj2.a + " " + obj2.b);
		obj2.swap(obj2);
		System.out.println("After: " + obj2.a + "" + obj2.b);
	}
}