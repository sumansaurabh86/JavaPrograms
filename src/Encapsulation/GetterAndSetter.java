package Encapsulation;

class student{
	
	private int roll;
	private String name;
	
	//Getter and Setter
	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	public int getRoll()
	{
		return roll;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

}
public class GetterAndSetter {

	public static void main(String[] args) {
		
		student s1 = new student();
		s1.setRoll(1);
		s1.setName("Suman");
		
		System.out.println("Student name is--->" +" "+ s1.getName());
		System.out.println("Student Roll no is--->" +" "+ s1.getRoll());
		
		
	}

}

