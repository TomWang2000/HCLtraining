package training.com.tomw.day6.assignments;
/*
 * I staggered the two threads by making the oddnumbs print later. 
 */

public class Prompt2 {

	public static void main(String[] args) {

		EvenNumbs obj1 = new EvenNumbs();
		Thread t1 = new Thread(obj1);
		OddNumbs obj2 = new OddNumbs();
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}

}

class EvenNumbs implements Runnable {
	private int a = 50;

	public void run() {
		for (int i = 1; i < a; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class OddNumbs implements Runnable {
	private int a = 50;

	public void run() {
		for (int i = 1; i < a; i++) {
			if (i % 2 > 0) {
				System.out.println(i);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}