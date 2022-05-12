package conditionalStatement;
import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		int pwd;
		System.out.println("Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==910)
		{
			System.out.println("My name is Suman");
			System.out.println("Age: 35");
			System.out.println("Address: Patna");
		}
		else 
		{
			System.out.println("Sorry incorrect Password");
		}
	}

}
