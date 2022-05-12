package LoopingStatement;  // Natural numbers upto 25

import java.util.Scanner;

public class do_While {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter any Number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		do
		{
			System.out.print(num+" ");
			++num;
		}
		while(num<=25);
		
	}

}
