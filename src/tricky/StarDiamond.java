package tricky;

public class StarDiamond {

	public static void main(String[] args) {
		
		// Pyramid Star
		for(int i=1; i<5; i++ ) 
		{
			for(int j=3; j>=i; j--) 
			{
				System.out.print(" ");	// space in decreasing order...3,2,1
			}
			
			for(int k=1; k<=i; k++) 
			{
				System.out.print("* ");	// stars * in increasing order
			}
			
			System.out.println();
		}

	//Reverse Pyramid star
		for(int i=1; i<5; i++ ) 
		{
		
			for(int j=1; j<=i; j++) 
			{
			System.out.print(" ");	// space in increasing order
			}
		
			for(int k=1; k<5-i; k++) 
			{
			System.out.print("* ");	// stars * in decreasng order
			}
		
			System.out.println();
		}

}


}
