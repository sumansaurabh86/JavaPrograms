package conditionalStatement;

public class Nested_ifelse {

	public static void main(String[] args) {
		int num1=20, num2=30, num3=50;
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Maximum Number: "+num1);
			}
			else
			{
				System.out.println("maximum Number: "+num3);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Maximum Number: "+num2);
			}
			else
			{
				System.out.println("maximum Number: "+num3);
			}
		}

	}

}
