package training.com.tomw.day2.assignment;
/*
 * Prompt 8 & 9
 */
public class Prompt8And9DoWhile {
	/*
	 * To calculate whether the number is prime
	 */
	public static boolean isPrime(int j) {
		if (j <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < j; i++) {  
	           if (j % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }    
	/*
	 * Prints odd numbers between 50 to 100 and prints the prime numbers from 1 to 100 using do whiles.
	 */
	public static void main(String[] args) {
		int i = 50;
		int k = 1;
		do {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		} while (i <= 100);
		
		System.out.println();
		
		do {
			if (isPrime(k)) {
				System.out.print(k + " ");
				k++;
			}
			else {
				k++;
			}
		} while (k <= 100);
	}

}
