package tricky;

import java.util.Scanner;

public class SumOfDigitsWhile {
	
public static void main(String []args) {
		
		int num,rem, sum=0;
		
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		num = s.nextInt();
		while(num>0) 
		{
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		
		System.out.println("addition is:"+sum);
	}

}
