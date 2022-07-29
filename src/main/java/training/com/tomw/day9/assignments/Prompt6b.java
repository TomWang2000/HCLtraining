package training.com.tomw.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Prompt6b {

	public static void main(String[] args) {
		
		Countries cn = null;
		try {
			FileInputStream fileOut = new FileInputStream("D:\\testfiles\\countries.txt");
			ObjectInputStream objectIn = new ObjectInputStream(fileOut);
			cn = (Countries) objectIn.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println(cn.getCountryName());

	}

}
