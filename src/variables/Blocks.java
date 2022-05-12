package variables;

public class Blocks {
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("Non static block");
	}
	
	Blocks(){
		System.out.println("this is constructor");
	}

	public static void main(String[] args) {
		
		
		System.out.println("main method");
		Blocks b=new Blocks();
	}

}
