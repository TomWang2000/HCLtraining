package training.com.tomw.day3.assignments;

public class Prompt2 {
	
	public int mult(int number1, int number2) {
		return (number1 * number2);
	}
	
	public int mult(int number1, int number2, int number3) {
		return (number1 * number2 * number3);
	}
	
	public static void main(String[] args) {
		Prompt2 mult = new Prompt2();
		System.out.println(mult.mult(10, 20));
		System.out.println(mult.mult(10, 20, 30));
	}
}
