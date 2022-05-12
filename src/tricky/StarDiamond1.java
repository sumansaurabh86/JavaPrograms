package tricky;

public class StarDiamond1 {

	public static void main(String[] args) {
		int i,j,k;
		// Pyramid Star
				for(i=1; i<=4; i++ ) 
				{
					for(j=4; j>i; j--) 
					{
						System.out.print(" ");	// space in decreasing order...3,2,1
					}
					
					for(k=1; k<=(2*i-1); k++) 
					{
						System.out.print("*");	// stars * in increasing order
					}
					
					System.out.println();
				}

			//Reverse Pyramid star
				for(i=3; i>=1; i--) 
				{
				
					for(j=4; j>i; j--) 
					{
					System.out.print(" ");	// space in increasing order
					}
				
					for(k=1; k<=(2*i-1); k++) 
					{
					System.out.print("*");	// stars * in decreasng order
					}
				
					System.out.println();
				}

	}

}
