package training.com.tomw.day5.assignments;

public class Prompt3 {

	public static void main(String[] args) {

		try {

			throw new UserDefinedException(4);

		} catch (UserDefinedException e) {

			System.out.println(e);

		}
	}

}

class UserDefinedException extends Exception {
	int x = 10;

	UserDefinedException(int y) {
		x = y;
	}

	public int ExceptionNumber() {
		return (x);
	}
}