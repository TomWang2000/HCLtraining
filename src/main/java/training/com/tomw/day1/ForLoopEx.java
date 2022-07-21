package training.com.tomw.day1;

public class ForLoopEx {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
		/*for(String str : args) {
			System.out.println(str);
		}
		*/
		for (int i = 1; i <= 100; i++) {
			if (i==20) {
				break;
			}
			System.out.println(i);
		}
	}

}
