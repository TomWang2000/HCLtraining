package training.com.tomw.day6;

public class PrintNumEx {

	public static void main(String[] args) {

		EvenNumbThread t1 = new EvenNumbThread();
		t1.start();

		EvenNumbThread t2 = new EvenNumbThread();
		t2.start();

	}
}

class EvenNumbThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Thread2 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}