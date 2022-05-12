package constructor;

class A{
	int a; String b; boolean c;
	
	A()
	{
		a=1000; b="suman"; c=true;
	}
	
	void disp()
	{
		System.out.println(a+" "+b+" "+c);
	}
}

public class NonArgumented {

	public static void main(String[] args) {
		
		A obj=new A();
		obj.disp();
	}

}
