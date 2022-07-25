package training.com.tomw.day5.assignments;

public class Prompt1 {

	public static void main(String[] args) {

		try {
			String str = null;
			System.out.println(str.charAt(4));
		} catch (NullPointerException e) {
			System.out.println("This is a NullPointerException");
		}
		try {
			int num1 = Integer.parseInt("Fake");
			int num2 = Integer.parseInt("100");
			System.out.println(num1 + num2);
		} catch (NumberFormatException e) {
			System.out.println("This is a Number Format Exception");
		}
	}

}
