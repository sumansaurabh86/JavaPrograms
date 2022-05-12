package com.demo.suman;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		
		  int a[]=new int[5]; System .out.print("Enter Array  up to 10 elements"); 
		  Scanner s=new Scanner(System.in); 
		  for (int i=0;i<10;i++) { 
			  a[i]=s.nextInt();
		  
		  }
		  
		  Arrays.sort(a); 
		  System.out.print("Sorted Array Elements:\n "); 
		  for(int b:a) {
			  System.out.print(b+" "); 
		  }
		 
	}

}
