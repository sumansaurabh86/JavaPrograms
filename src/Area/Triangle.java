package Area;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		double b,h;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Base");
		b=s.nextDouble();
		
		System.out.println("Enter Height ");
		h=s.nextDouble();
		
		double area=(b*h)/2;
		System.out.println("Area of triangle is "+area);
		
	}

}
