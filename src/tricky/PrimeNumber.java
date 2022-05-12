package tricky;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
				
		int num, count=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		num = s.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}

	}
}



