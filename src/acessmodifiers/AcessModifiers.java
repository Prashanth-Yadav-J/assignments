package acessmodifiers;

public class AcessModifiers {
	public int a=1;
	private int b=2;
	protected int c=3;
	int d=4;

	public static void main(String[] args) {
		AcessModifiers am1=new AcessModifiers();
		System.out.println("Public modifier value is:"+am1.a);
		System.out.println("Private modifier value is:"+am1.b);
		System.out.println("Protected modifier value is:"+am1.c);
		System.out.println("Default modifier value is:"+am1.d);
		

	}

}
