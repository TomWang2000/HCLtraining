package training.com.tomw.day1;

public class WhileEx {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = 0;
		
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		do {
			System.out.print(j + " ");
			j++;
		} while (j < i);
	}

}
