package array;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Int {
	
public static void main(String [] args) {
		
		int [] a = {1,2,4,8,6,9,14,2,8,7};
		
		System.out.print("Duplicate elements are: ");
		
		Set<Integer> s = new HashSet<>();
		
		for(int no : a) {
			
			boolean b =s.add(no);
			if(b==false) {
				
				System.out.print(no + " ");
			}
			
		}
	}

}
