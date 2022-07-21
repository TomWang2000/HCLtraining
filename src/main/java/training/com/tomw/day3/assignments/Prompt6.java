package training.com.tomw.day3.assignments;

public class Prompt6 {
	
	public static void main(String[] args) {
		Cat cat = new PersianCat();
		cat.CatDoMath();
		cat.Type();
	}
}

	interface Cat {
		void CatDoMath();
		
		void Type();
	}

	class PersianCat implements Cat {
		
		public void CatDoMath() {
			System.out.println("Cat calculating maths");
			System.out.println("1 + 1 = " + 1 + 1);
		}
		
		public void Type() {
			System.out.println("I am a persian cat!");
		}
	}