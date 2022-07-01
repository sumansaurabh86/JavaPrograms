package tricky;

import java.util.Scanner;

public class VowelCount {
	
	public static void main(String[] args){
		
		int i, vCount=0, cCount=0 ;
		char ch ;
		
		System.out.println("Enter any String" );
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int l = s.length();
		s = s.toLowerCase();
		for(i=0 ; i<l ; i++) 
		{
			ch = s.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ) 
			{
				vCount++ ;
			}
			else 
			{
				cCount++ ;
			}
				
		}
		System.out.println("Total no of Vowels: " +vCount );
		System.out.println("Total no of Consonent: " +cCount );
		
	}

}
