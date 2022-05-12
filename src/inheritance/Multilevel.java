package inheritance;

class A
{
	int a,b,c;
	
	void add()
	{
		a=10 ; b=20 ;
		c=a+b ;
		System.out.println("Sum of two numbers:" +c);
	}
	
	void sub()
	{
		a=200 ; b=50;
		c=a-b;
		System.out.println("Difference of two numbers:" +c);
	}
}

class B extends A
{
	void multi()
	{
		a=10 ; b=20 ;
		c=a*b ;
		System.out.println("Product of two numbers:" +c);
	}
	
	void div()
	{
		a=20 ; b=5 ;
		c=a/b ;
		System.out.println("Division of two numbers:" +c);
	}
}

class C extends B
{
	void rem()
	{
		a=10 ; b=3 ;
		c=a%b ;
		System.out.println("Remainder of two numbers:" +c);
	}
}


public class Multilevel {

	public static void main(String[] args) {
		
		C r=new C();
		r.add(); r.sub(); r.multi(); r.div();r.rem();

	}

}
