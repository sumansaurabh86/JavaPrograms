package array;

public class MinimumNumber {
	
	public static void main(String[] args) {
			
		int a[] = {40,5,10,60,25};
		int min = a[0];
			
		for(int i=0; i<a.length; i++) {
				
			if(a[i]<min) 
			{
					min = a[i];
			}
		}
			
		System.out.println("minimum no is: " + min);

	}	// minimum no is: 5


}
