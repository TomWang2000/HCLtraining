package training.com.tomw.day4;

public class ArrayEx {

	public static void main(String[] args) {

		int intArr[] = new int[5]; // Will only contain integers

		intArr[0] = 5; // Initializes position 0 as 5 (1st slot)
		intArr[2] = 8; // Initializes position 2 as 5 (3rd slot)

		for (int i : intArr) {
			System.out.println(i);
		}

		String strArr[] = new String[3];

		int intArr2[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		String strArr2[] = { "hcl", "tech", "usa" };

	}

}
