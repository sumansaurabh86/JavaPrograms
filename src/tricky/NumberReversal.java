package tricky;

import java.util.Scanner;

public class NumberReversal {
	
public static void main(String []args) {
		
		int num, s=0, r ;
		
		System.out.println("Enter any number");
		Scanner ref=new Scanner(System.in);
		num=ref.nextInt();
		
		while(num>0)
		{
			r = num%10;
			s = (s*10)+r;
			num = num/10;
		}
		System.out.println("Reverse Number is:"+s);

	}
}
