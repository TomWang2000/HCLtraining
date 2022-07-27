package training.com.tomw.day7;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		v.add("dog");
		v.add("Cat");
		v.add("Dolphin");

		for (String str : v) {
			System.out.println(str);
		}

		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
