package training.com.tomw.day2.assignment;
/*
 * This is for prompt 2 & 3
 */
public class Prompt2And3OddEvenAssignment {

	public static void main(String[] args) {
		Obj obj = new Obj();
		for(int i = 1; i <= obj.Var2(); i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is an even number");
			}
			else {
				System.out.println(i + " is an odd number");
			}
		}

	}

}
