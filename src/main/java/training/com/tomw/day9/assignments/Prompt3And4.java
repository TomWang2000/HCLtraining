package training.com.tomw.day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prompt3And4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		FileReader in = null;
		FileWriter out = null;
		System.out.println("Enter input: ");
		String input = scan.next();
		System.out.println("Enter output: ");
		String output = scan.next();
		try {
			in = new FileReader(input);
			out = new FileWriter(output);

			int c = 0;

			while ((c = in.read()) != -1) {
				out.write(c);
				System.out.println(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		scan.close();
	}

}
