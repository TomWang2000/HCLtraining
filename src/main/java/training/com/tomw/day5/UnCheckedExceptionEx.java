package training.com.tomw.day5;

public class UnCheckedExceptionEx {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]); //args[1] is a normal string, was expecting an string can be converted to string
		// It can be compiled seeing there is no issue, but found the issue during execution = UnCheckedExceptio
		//System.out.println(i + " " + j);
		
		//Divide by Zero
		System.out.println(i/j);

	}

}
