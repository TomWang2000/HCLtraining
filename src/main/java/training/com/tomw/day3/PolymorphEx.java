package training.com.tomw.day3;
/*
 * creating another class within a class. It just makes another one. Not nested classes
 * also have class overloading
 */
public class PolymorphEx {

	public static void main(String[] args) {
		MyCalc obj = new MyCalc();
		int result = obj.add(10, 2);
		System.out.println(result);
		result = obj.add(10, 2, 4);
		System.out.println(result);
	}

}

class MyCalc {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
