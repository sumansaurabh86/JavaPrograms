package conditionalStatement;
import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		int marks;
			while(true) {
				System.out.println("Enater Marks");
				Scanner s=new Scanner(System.in);
				marks=s.nextInt();
				if(marks>=60 && marks<=100)
				{
					System.out.println("First Division");
				}
				else if(marks>=45 && marks<60) 
				{
					System.out.println("Second Division");
				}
				
				else if(marks>=33 && marks<45) 
				{
					System.out.println("Third Division");
				}
				
				else
				{
					System.out.println("Failed");
				}
				
				
				System.out.println("Enter 'Y' to continue, press any other key to exit");
				Scanner scnr1=new Scanner(System.in);
				String continueFlag = scnr1.next();
				if(!continueFlag.equalsIgnoreCase("Y")) {
					break;
				}
			}
			 
		 
			
	}
	
	

}
