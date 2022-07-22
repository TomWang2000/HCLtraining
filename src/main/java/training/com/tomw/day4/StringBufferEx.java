package training.com.tomw.day4;

public class StringBufferEx {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Welcome to stringbuffer...");
		
		System.out.println(sb.append(" members "));
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.insert(10," my new "));
		System.out.println(sb.delete(6, 10));
		System.out.println(sb.reverse());
		
	}

}
