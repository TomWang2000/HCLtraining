package training.com.tomw.day6.assignments;

public class Prompt1 {

	public static void main(String[] args) {
		printNumbs obj = new printNumbs();
		obj.start();
	}
}

class printNumbs extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
		}
	}
}