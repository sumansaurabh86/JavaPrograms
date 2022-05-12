package staticVar;

public class StaticExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1 = new Test();
		t1.a = 25;
		t1.b = 93;
		
		Test t222222 = new Test();
		System.out.println("t222222 ::: a="+t222222.a+", b="+t222222.b);
		
		
	}

}

class Test{
	public static int a=10;
	public int b=110;
}
