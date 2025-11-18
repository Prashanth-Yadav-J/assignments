package conditionalstatements;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=15;
		int c=20;
		if(b>a)
		{
			System.out.println("B is greater than A. Value of B is:"+b);
		}
		else if(c>b)
		{
			System.out.println("C is not greater than B. Value of C is:"+c);
		}
		else if(c>a)
		{
			System.out.println("C is not greater than A. Value of C is:"+c);
		}
		else
		{
			System.out.println("Statement is not correct");
		}

	}

}
