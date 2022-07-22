package training.com.tomw.day4.assignments;

public class Promp1 {

	public static void main(String[] args) {
		
		String str1 = "Tommy";
		String str2 = "Wang";
		System.out.println(!str1.equals(str2));
		String str3 = str1.concat(str2);
		System.out.println(str3);
		System.out.println(str3.concat(" Jr."));
		System.out.println(str3.length());
		System.out.println(str3.charAt(4));
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		System.out.println(str3.substring(4));
		System.out.println(str3.substring(4, 6));
		System.out.println(str3.contains("ommy"));
		String str4 = String.join("_", "Tommy", "is", "from", "Texas");
		System.out.println(str4);
		System.out.println(str3.compareTo(str4));


	}

}
