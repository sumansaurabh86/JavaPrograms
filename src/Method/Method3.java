package Method;

public class Method3 {

	int a=10;				// instance variable, can't be called without object
	static double b=20.5;	// static variable can be called without object
		
	public static void main(String[] args) {
		
		boolean c = true;	// local variable can be called without object
		
		Method3 m= new Method3();
		System.out.println(m.a);
		System.out.println(b);
		System.out.println(c);
		
		//System.out.println(m.a+" "+b+" "+c);
		
		

	}

}
