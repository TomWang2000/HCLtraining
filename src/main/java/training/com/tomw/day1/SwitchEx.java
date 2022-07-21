package training.com.tomw.day1;

public class SwitchEx {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		String str = null;
		
		switch(1) {
		case 0 :
			System.out.println("Zero");
			break;
		case 1 :
			System.out.println("One");
			break;
		case 2 : 
			System.out.println("Two");
			break;
		default :
			System.out.println("Not Found");
		}

	}

}
