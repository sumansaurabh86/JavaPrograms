package keyword;

public class StaticKey {
	
	static int a = m1();
	//static block
	static
	{
		System.out.println("Inside Static Block");
	}
	//static method
	static int m1()
	{
		System.out.println("Inside Static Method");
		return 20;
	}

	public static void main(String[] args) {
		
		System.out.println("Value of a :" +a);
		System.out.println("From main method");

	}

}
