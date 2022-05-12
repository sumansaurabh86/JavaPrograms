package keyword;

//this keyword calls Argumented constructor
public class A {
	
	A()
	{
		this(10);
	}
	
	A(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		A obj = new A();

	}

}
