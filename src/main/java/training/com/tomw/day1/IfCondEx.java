package training.com.tomw.day1;

public class IfCondEx {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		
		if(i%2 == 0) {
			System.out.println("It's an even number");
			if(i > 100) {
				System.out.println("It's larger than 100");
			}
			else {
				System.out.println("It's smaller than 100");
			}
		}
		else {
			System.out.println("It's not an even number");
		}
	}

}
