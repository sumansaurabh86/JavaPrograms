package variables;

public class Test1 {
	static int a=20;	//static variable
	int b=30;			//INSTANCE variable
	

	public static void main(String[] args) {
		
		int c=10;		//Local variable
		
		Test1 t=new Test1();
	  //System.out.println(Test1.a);
		System.out.println(a);
		System.out.println(t.b);
		System.out.println(c);
		
		
		

	}

}
