package polymorphism;

public class MethodOverloading {
	
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum of 2 numbers is:"+sum);
	}
	
	public void subtract(int a,int b)
	{
		int sub=a-b;
		System.out.println("Subtraction of 2 number is:"+sub);
	}
	
	public void subtract(int a,int b,int c)
	{
		int sub=a-b-c;
		System.out.println("Subtraction of 3 number is:"+sub);
	}

	public static void main(String[] args) {
		MethodOverloading methodoverloading=new MethodOverloading();
		methodoverloading.add(5, 1);
		methodoverloading.subtract(5, 1);
		methodoverloading.subtract(1,2,3);
	}

}
