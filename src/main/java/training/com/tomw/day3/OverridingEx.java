package training.com.tomw.day3;

	
	class Bank {
		
		float getRateOfInterest() {
			return 9.0f;
		}
	}
	
	class BankA extends Bank{
		
		float getRateOfInterest() {
			return 8;
		}
	}
	
	class BankB extends Bank {
		float getRateOfInterest() {
			return 7.5f;
		}
	}
	
	class BankC extends Bank {
		
	}
	
	class OverridingEx {
		
	public static void main(String[] args) {
		BankC c = new BankC();
		System.out.println(c.getRateOfInterest());
		
		BankB b = new BankB();
		System.out.println(b.getRateOfInterest());
	}
	
}
