package training.com.tomw.day3.assignments;

public class Prompt5 {
	public static void main(String[] args) {

		Plane plane = new Boeing();
		plane.flying();
		plane.type();

	}
}

abstract class Plane {
	public void flying() {
		System.out.println("Preparing to takeoff");
		System.out.println("Flying... Whoooshh!");
	}

	public abstract void type();
}

class Boeing extends Plane {
	public void type() {
		System.out.println("I am a Boeing plane!");
	}
}
