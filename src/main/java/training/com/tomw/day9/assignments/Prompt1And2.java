package training.com.tomw.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Prompt1And2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;
		System.out.println("Enter input file: ");
		String inputFile = scan.next();
		System.out.println("Enter output file: ");
		String outputFile = scan.next();
		int temp = 0;
		try {
			try {
				sourceStream = new FileInputStream(inputFile);
				targetStream = new FileOutputStream(outputFile);
				while ((temp = sourceStream.read()) != -1) {
					targetStream.write((byte) temp);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sourceStream != null) {
					sourceStream.close();
				}
				if (targetStream != null) {
					targetStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		scan.close();
	}

}
