package training.com.tomw.day4.assignments;

public class Prompt4 {

	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		int intArr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i : intArr) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("Sum of the even numbers in Array is: " + evenSum);
		System.out.println("Sum of the odd numbers in Array is: " + oddSum);
	}

}
