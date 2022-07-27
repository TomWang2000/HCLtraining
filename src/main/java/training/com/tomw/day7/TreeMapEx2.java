package training.com.tomw.day7;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx2 {

	public static void main(String args[]) {

		TreeMap<String, String> treemap = new TreeMap<String, String>();

		treemap.put("H", "A");
		treemap.put("D", "J");
		treemap.put("B", "D");
		treemap.put("F", "A");
		treemap.put("P", "P");

		for (Map.Entry<String, String> entry : treemap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
