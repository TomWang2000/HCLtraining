package training.com.tomw.day3;

public class InheritanceEx {

	public static void main(String[] args) {
		Doctor d1 = new Doctor();
		d1.setName("doctor1");
		d1.setAge(30);
		
		Surgeon s = new Surgeon();
		s.setSpec1("Cardio");
		s.setAge(45);
		s.setName("Name2");
		
		
		s.getSpec1Details();
		s.getDetails();

	}
	

}
