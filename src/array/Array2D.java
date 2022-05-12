package array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		
		int a[][] = new int [2][3];
		System.out.println("Enter Array Elements");
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Matrix Elements");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
