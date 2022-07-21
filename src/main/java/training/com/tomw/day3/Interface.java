package training.com.tomw.day3;

public class Interface {

	public static void main(String[] args) {
		Shape c = new Circle();
		c.draw();
		c.area();
		c = new Triangle();
		c.draw();
		c.area();

	}
}
	
	interface Shape{
		
		void draw();
		
		void area();
	}
	
	class Circle implements Shape {
		@Override
		public void draw() {
			System.out.println("Drawing Circle");
		}
		
		@Override
		public void area() {
			System.out.println("Calculating area of circle");
		}
	}
	
	class Triangle implements Shape {
		@Override
		public void draw() {
			System.out.println("Drawing triangle");
	}
		
		@Override
		public void area() {
			System.out.println("Calculating area of triangle");
		}
	}

	
