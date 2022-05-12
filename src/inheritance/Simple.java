package inheritance;

class student
{
	int roll, marks;
	String name;
	
	void input()
	{
		System.out.println("Enter Roll, Name and Marks:");
	}
}

class suman extends student
{
	void disp()
	{
		roll=1; name= "suman"; marks=89;
		System.out.println(roll+" "+ name+" "+ marks);
	}
}

public class Simple {

	public static void main(String[] args) {
		suman s=new suman();
		s.input(); s.disp();

	}

}
