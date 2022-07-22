package training.com.tomw.day4.assignments;

public class Prompt3 {

	public static void main(String[] args) {
		StringBuilder strBuild = new StringBuilder("I am a Cat");
		System.out.println(strBuild);
		System.out.println(strBuild.append(". Actually I am a Dog "));
		System.out.println(strBuild.capacity());
		System.out.println(strBuild.length());
		System.out.println(strBuild.insert(5, "not "));
		System.out.println(strBuild.delete(1, 3));
		System.out.println(strBuild.reverse());

	}

}
