package training.com.tomw.day4.assignments;

public class Prompt6 {

	public static void main(String[] args) {
		int matrix[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 91, 92, 93 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
