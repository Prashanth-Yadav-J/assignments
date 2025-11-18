package conditionalstatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=15;
		int c=20;
		if(b>a)
		{
			if(c>b)
			{
				System.out.println("C is Greater than B,A and the value of C is:"+c);
			}
		}

	}

}
