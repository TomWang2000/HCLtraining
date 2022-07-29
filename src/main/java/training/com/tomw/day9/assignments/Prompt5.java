package training.com.tomw.day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Prompt5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BufferedWriter buffW = null;
		BufferedReader buffR = null;
		System.out.println("Enter input: ");
		String input = scan.next();
		System.out.println("Enter output: ");
		String output = scan.next();
		
		try {
			Reader read = new FileReader(input);
			buffR = new BufferedReader(read);
			String out = null;
			
			File outFile = new File(output);
			Writer write = new FileWriter(outFile);
			buffW = new BufferedWriter(write);
			
			while((out = buffR.readLine()) != null) {
				buffW.write(out);
				System.out.println(out);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffW.close();
				buffR.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
