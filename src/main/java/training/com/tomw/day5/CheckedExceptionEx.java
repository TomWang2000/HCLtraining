package training.com.tomw.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

public class CheckedExceptionEx {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File(null);
		BufferedReader br = new BufferedReader(new FileReader(file));

	}

}
