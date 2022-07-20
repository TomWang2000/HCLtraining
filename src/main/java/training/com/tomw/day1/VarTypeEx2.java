package training.com.tomw.day1;

public class VarTypeEx2 {
	
	int count = 10;
	
	static int num = 20; //Static will make it treated as a static method
	
	public void testVar() {
		int i = 5; //Local variable to only this method. Can only be accessed within this method.
		System.out.println(i);
	}
	
	public void testVar2() {
		int j = 6;
		System.out.println(j);
	}
}
