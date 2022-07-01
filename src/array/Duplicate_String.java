package array;

public class Duplicate_String {
	
public static void main(String [] args) {
		
		String [] name = {"java", "javascript", "Ruby", "Python", "C", "java"};
		
		for(int i=0; i<name.length; i++) {
			
			for(int j=i+1; i<name.length; j++) {
				
				if(name[i].equals(name[j])) 
				{
					System.out.println("duplicate element is: " + name[i]);
					
				}
			}
		}
	}

}
