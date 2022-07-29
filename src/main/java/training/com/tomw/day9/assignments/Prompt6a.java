package training.com.tomw.day9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Prompt6a {

	public static void main(String[] args) {


		Countries country = new Countries("USA");
		
		FileOutputStream fileOut = null;
		ObjectOutputStream objectOut = null;
		System.out.println(country.getCountryName());
		try {
			fileOut = new FileOutputStream("D:\\testfiles\\countries.txt");
			objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(country);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOut.close();
				objectOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

@Setter
@Getter
@AllArgsConstructor
class Countries implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String countryName;
	
	void countryName (String a){
		this.countryName = a;
	}
}