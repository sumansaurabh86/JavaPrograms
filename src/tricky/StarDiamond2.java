package tricky;

import java.util.Scanner;

public class StarDiamond2 {

	public static void main(String[] args) {
		
		System.out.println("How many Rows you want in Diamond ?");
		Scanner s= new Scanner(System.in);
		int NoOfRows = s.nextInt();
		
		int midRow = NoOfRows/2;
		
		int row=1;
		System.out.println("Here is your Diamond");
		
		for(int i=midRow; i>0; i--)
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=row; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			row++ ;
		}
		
		
		for(int i=0; i<=midRow; i++)
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=row; j>0; j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
			row-- ;
		}

	}

}
