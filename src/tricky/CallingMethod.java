package tricky;

public class CallingMethod {
	
	//static int r;
	static int sum(int a, int b) 
	{
		return a+b;
	}

	
	public static void main(String[] args) {
		
		//	r = sum(10, 20);
		int r = sum(10, 20);
		System.out.println("Addition:" + r);
		
		}
		
		
	

}
