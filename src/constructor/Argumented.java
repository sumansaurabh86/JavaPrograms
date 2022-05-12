package constructor;

class B{
	
	int x ,y;
	B(int a, int b)
	{
		x = a; y = b;
		//System.out.println(x+" "+y);
	}
	
	void show()
	{
		System.out.println(x+" "+y);
	}
}

public class Argumented {
	
	public static void main(String[] args) {
		
		B obj = new B(100,200);
		obj.show();
	}

}
