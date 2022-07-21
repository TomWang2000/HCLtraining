package training.com.tomw.day3;


/*
 * Inheritance from Doctor.java
 * This is a sub class
 * has all the properties from Doctor.java (super class)
 */

public class Surgeon extends Doctor {
	
	private String spec1;
	
	
	public String getSpec1() {
		return spec1;
	}

	public void setSpec1(String spec1) {
		this.spec1 = spec1;
	}

	public void getSpec1Details() {
		System.out.println(spec1);
	}
}
