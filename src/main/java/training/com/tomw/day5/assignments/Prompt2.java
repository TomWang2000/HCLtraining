package training.com.tomw.day5.assignments;

public class Prompt2 {

	public static void main(String[] args) {
		try {
			int arr[] = { 0, 40, 0, 30, 2 };
			for (int i = 1; i < arr.length; i++) {
				int last = (i + arr[i]) / arr[i];
				System.out.println(last);
			}
		} catch (ArithmeticException e) {
			System.out.println("This is an Arithmetic Exception due to diving by 0");
		}

	}

}
