package tricky;

import java.util.Scanner;

public class Palindrome {
	
public static void main(String []args) {
		
		int num, s=0, r, temp ;
		
		System.out.println("Enter any number");
		Scanner ref=new Scanner(System.in);
		num = ref.nextInt();
		
		temp = num ;
		while(num>0)
		{
			r = num%10;
			s = (s*10)+r;
			num = num/10;
		}
		
		if(s==temp)
		{
			System.out.println("Pelindrome Number");
		}
		
		else
		{
			System.out.println("Not Pelindrome Number");
		}
		
		
	}

}
