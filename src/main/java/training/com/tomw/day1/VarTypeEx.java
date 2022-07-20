package training.com.tomw.day1;

public class VarTypeEx {

	public static void main(String[] args) {
		VarTypeEx obj = new VarTypeEx();
		obj.testVar();

	}
	private void testVar() {
		int i = 5; //Local variable to only this method. Can only be accessed within this method.
		System.out.println(i);
	}
	
	private void testVar2() {
		int j = 6;
		System.out.println(j);
	}
}
