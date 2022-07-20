package training.com.tomw.day2.assignment;
/*
 * This is for prompt 1
 */
public class Prompt1VariablesAssignment {

	public static void main(String[] args) {
		Obj obj = new Obj();
		System.out.println(obj.Var1() + obj.Var2()); //Arithmetic
		System.out.println(obj.Var2() % obj.Var1()); //Unary
		System.out.println(obj.Var1() == obj.Var2()); //Relational
		System.out.print(obj.Bool1() && obj.Bool2()); //Logical Operation
	}

}
