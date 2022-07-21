package training.com.tomw.day2.assignment;
/*
 * Prompt 10 & 11
 */
public class Prompt10And11ContinueAndBreakForLoop {

	public static void main(String[] args) {
		// For loop from 1 to 100 using continue statement to print only odd numbers
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		// For loop from 50 to 100 to print only even numbers using break to stop at 75.
		for (int i = 50; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			else if (i == 75) {
				break;
			}
		}
	}

}
