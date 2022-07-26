package training.com.tomw.day6.assignments;

public class Prompt3 {

	public static void main(String[] args) {

		NumOfApples apple = new NumOfApples();
		SubClassApples sub = new SubClassApples(apple);
		Thread t1 = new Thread(sub);
		t1.start();
	}

}

class NumOfApples {
	int total;

	public NumOfApples() {
		total = 100;
	}

	public synchronized void eat(int eat) {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println("EXCEPTION");
		}
		total = total - eat;
		System.out.println("Apples Not Eaten: " + total);
	}
}

class SubClassApples implements Runnable {
	NumOfApples apples;

	public SubClassApples(NumOfApples a) {
		apples = a;
	}

	public void run() {
		while(apples.total != 0) {
			apples.eat(20);
			if (apples.total == 0) {
				System.out.println("NO MORE APPLES");
			}
		}
	}
}