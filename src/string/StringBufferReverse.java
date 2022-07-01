package string;

import java.util.Scanner;

public class StringBufferReverse {
	
	public static String Reverse(String str) {
		
		StringBuffer obj = new StringBuffer(str);
		obj.reverse();
		str=obj.toString();
		return str;
	}

	public static void main(String[] args) {
		System.out.println("Enter any string");
		Scanner s = new Scanner(System.in);
		System.out.println(Reverse(s.nextLine()));

	}

}
