package tricky;

public class StringReverse1 {

	public static void main(String[] args) {
		
		String origional = "Suman", reverse="";
		
		int size = origional.length();
		
		for(int i=size-1; i>=0; i--) {
			
			reverse= reverse + origional.charAt(i);
		}
		System.out.println(reverse);

	}

}
