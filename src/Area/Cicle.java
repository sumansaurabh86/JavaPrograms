package Area;

import java.util.Scanner;

public class Cicle {

	public static void main(String[] args) {
		
		double r;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Radius");
		r = s.nextDouble();
		
		double area=(22*r*r)/7;
		System.out.println("Area of Cirle is "+ area +" sq unit");

	}

}
