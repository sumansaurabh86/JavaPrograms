package constructor;

class D{
	
	int roll;
	String name;
	
	D(int i, String n)
	{
		roll = i;
		name = n;
	}
	
	D(D ref)
	{
		roll = ref.roll;
		name = ref.name;
	}
	
	void disp()
	{
		System.out.println(roll+ " " +name);
	}
}

public class Copy {

	public static void main(String[] args) {
		D obj = new D(1, "SUMAN");
		D obj2 = new D(obj);
		
		obj.disp();
		obj2.disp();

	}

}
