package keyword;

//whenever name of instance variable and local variable is same
// To avoid ambiguity we use this keyword
public class ThisA {
	
	int a;
	ThisA(int a)
	{
		this.a=a;
	}
	
	void show()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		ThisA obj = new ThisA(100);
		obj.show();

	}

}
