package polymorphism;

public class MethodOverriding extends MethodOverloading
{
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition of 2 numbers is:"+sum);
	}

	public static void main(String[] args) {
		
		MethodOverriding methodoverriding=new MethodOverriding();
		methodoverriding.add(5, 1);
		MethodOverloading methodoverloading=new MethodOverloading();
		methodoverloading.add(5, 2);

	}

}
