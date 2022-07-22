package training.com.tomw.day4.assignments;

public class Prompt2 {

	public static void main(String[] args) {
		StringBuffer strBuff = new StringBuffer("My name is John");
		System.out.println(strBuff);
		System.out.println(strBuff.append(". Actually my name is Tommy "));
		System.out.println(strBuff.capacity());
		System.out.println(strBuff.length());
		System.out.println(strBuff.insert(29, "new "));
		System.out.println(strBuff.delete(15, 30));
		System.out.println(strBuff.reverse());

	}

}
