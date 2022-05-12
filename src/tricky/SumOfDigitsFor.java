package tricky;

import java.util.Scanner;

public class SumOfDigitsFor {
	
public static void main(String []args) {
		
		int n, sum=0;
		
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(sum=0; n!=0; n=n/10) 
		{
			sum = sum +n%10;
		}
		System.out.println("addition is:"+sum);
	}

}
