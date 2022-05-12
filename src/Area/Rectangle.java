package Area;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		double l,b;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Length");
		l=s.nextDouble();
		
		System.out.println("Enter Width ");
		b=s.nextDouble();
		
		double area=(l*b);
		System.out.println("Area of Rectangle is "+ area + " sq unit");

	}

}
