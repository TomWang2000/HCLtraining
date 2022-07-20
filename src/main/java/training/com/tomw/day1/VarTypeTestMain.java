package training.com.tomw.day1;

public class VarTypeTestMain {

	public static void main(String[] args) {
		VarTypeEx2 obj = new VarTypeEx2();
		obj.testVar(); //Can be used because the method is public in VarTypeEx2
		obj.testVar2(); //Can't be used because the method is private in VarTypeEx2
		
		VarTypeEx2 obj1 = new VarTypeEx2();
		obj1.count = 5;
		System.out.println("count = " + obj1.count);
		System.out.println("num = " + obj1.num);
		obj1.num = 15;
		System.out.println("num = " + obj1.num);
		
		VarTypeEx2 obj2 = new VarTypeEx2();
		System.out.println("count = " + obj2.count);
		
		
	}

}
