package tricky;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		int n, k=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		n = s.nextInt();
		
		for(int i=2; i<(n/2); i++)
		{
			if(n%i==0)
			{
				k=k+1;
				break;
			}
		}
		
		if(k==1)
		{
			System.out.println("Not Prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}
	}

}
