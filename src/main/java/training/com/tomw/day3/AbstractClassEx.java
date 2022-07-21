package training.com.tomw.day3;

public class AbstractClassEx {

	public static void main(String[] args) {

		Animal animal = new Dog();
		animal.walk();
		animal.sound();

	}
}
	
	abstract class Animal{
		public void walk() {
			System.out.println("Walking...!");
		}
		
		public abstract void sound();
	}
	
	class Dog extends Animal {
		public void sound() {
			System.out.println("Bark!");
		}
	}

