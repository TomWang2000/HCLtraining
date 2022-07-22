package training.com.tomw.day4;

public class StringEx {

	public static void main(String[] args) {

		String str = "HCL"; // You can't modify this
		
		String str2 = "HCL";
		
		System.out.println(str == str2);
		
		String str3 = new String("HCL");
		
		String str4 = new String("HCL");
		
		System.out.println(str3 == str4); //This checks object references
		
		System.out.println(str3.equals(str4)); //This checks content
	}

}
