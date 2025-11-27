package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int h=8;
		// Arithmetic
		int c=a+b;
		System.out.println("Addition of two numbers is:"+c);
		// Subtraction
		int d=c-a;
		System.out.println("Subtraction of two numbers is:"+d);
		// Multiplication
		int e=d*b;
		System.out.println("Multiplication of two numbers is:"+e);
		// Division
		int f=e/b;
		System.out.println("Division of two numbers is:"+f);
		// Modulus
		int g=c%b;
		System.out.println("Modules of two numbers is:"+g);
		// Pre Increment
		System.out.println("Pre Increment:");
		System.out.println(++h);
		// Post Increment
		System.out.println("Post Increment");
		System.out.println(h++);
		System.out.println(h);
		// Pre Decrement
		System.out.println("Pre Decrement");
		System.out.println(--h);
		// Post Decrement
		System.out.println("Post Decrement");
		System.out.println(h--);
		System.out.println(h);

	}

}
