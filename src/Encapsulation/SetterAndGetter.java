package Encapsulation;
class studentN{
	
	private int roll;
	private String name;
	
	//Getter and Setter
	public void setRoll(int r)
	{
		roll = r;
	}
	public int getRoll()
	{
		return roll;
	}
}
public class SetterAndGetter {

	public static void main(String[] args) {
		
		studentN s1 = new studentN();
		s1.setRoll(7);
		System.out.println(s1.getRoll());
		
	}

}
