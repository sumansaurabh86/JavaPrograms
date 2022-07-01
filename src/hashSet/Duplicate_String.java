package hashSet;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_String {
	
public static void main(String [] args) {
		
		String [] language = {"java", "javascript", "Ruby", "Python", "C", "java"};
		 
		Set<String> store = new HashSet<>();
		for(String name:language) {
			
			boolean b = store.add(name);
			if(b==false)
			{
				System.out.println("Duplicates are: " + name);
			}
		}
		
	}

}
