package tricky;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		String original , reverse = "";
		
		System.out.println("Enter any String");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		int length = original.length();
		
		for(int i=length-1; i>=0; i--) 
		{
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reversed String is: " + reverse); 
	}

}
