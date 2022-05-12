package variables;

public class Test2 {
	
	static int a=10;
	void fun()
	{
		int b=10;
		System.out.println(a+" "+b);
		a++ ;	b++ ;
	}

	public static void main(String[] args) {
		
		Test2 t=new Test2();
		t.fun();
		t.fun();

	}

}
