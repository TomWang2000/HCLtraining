package training.com.tomw.day3.assignments;

class Number {

	int getNumber() {
		return 2;
	}
}

class Number1 extends Number {
	int getNumber() {
		return 400;
	}
}

class Number2 extends Number {
	int getNumber() {
		return 10;
	}
}

class Number3 extends Number {

}

class Prompt4 {

	public static void main(String[] args) {
		Number1 numb1 = new Number1();
		System.out.println(numb1.getNumber());

		Number2 numb2 = new Number2();
		System.out.println(numb2.getNumber());

		Number3 numb3 = new Number3();
		System.out.println(numb3.getNumber());
	}

}
