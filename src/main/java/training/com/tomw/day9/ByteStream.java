package training.com.tomw.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) {
		
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;
		int temp = 0;
		
		try {
			try {
				sourceStream = new FileInputStream(FILE.png);
				targetStream = new FileOutputStream(Filee.png);
				
				while ((temp = sourceStream.read()) != -1) {
					targetStream.write((byte) temp);
				}
				System.out.println("Success");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
