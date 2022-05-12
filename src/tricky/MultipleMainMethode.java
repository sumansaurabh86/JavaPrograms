package tricky;

public class MultipleMainMethode {

	public static void main(String[] args) {
		
		System.out.println("Inside main 1");
		
		main(1);
		main("");
	}
	
	
	public static void main (String args) {
		
		System.out.println("Inside main 2");
	}

	
	public static int main (int args) {
	
	System.out.println("Inside main 3");
	return 5;
	}
}
