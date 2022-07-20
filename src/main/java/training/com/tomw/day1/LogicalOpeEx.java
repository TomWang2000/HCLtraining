package training.com.tomw.day1;

public class LogicalOpeEx {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = false;
		
		System.out.println(a && b);
		System.out.println(a && c);
		System.out.println(d && b);
		
		System.out.println(a || b);
		System.out.println(a || c);
		System.out.println(d || b);
	}

}
