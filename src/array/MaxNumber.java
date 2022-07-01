package array;

public class MaxNumber {

	public static void main(String[] args) {
		
		int a[] = {40,5,10,60,25};
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>max) 
			{
				max = a[i];
			}
		}
		
		System.out.println("maximum no is: " + max);

	}	// maximum no is: 60

}
