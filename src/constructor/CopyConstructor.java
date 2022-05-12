package constructor;

class C{
	
	int a; String b;
	
	C()
	{
		a=10; b="Learn Java";
		System.out.println(a+" "+b);
	}
	
	C(C ref)
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
	
}
public class CopyConstructor {

	public static void main(String[] args) {
		C r=new C();
		C r2=new C(r);

	}

}
