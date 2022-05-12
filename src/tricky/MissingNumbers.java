package tricky;

public class MissingNumbers {

	public static void main(String[] args) {
		
		int [] input = {1,1,2,3,5,5,7,9,9,9};
		//System.out.println(input.length);
		int [] register = new int [input.length];
		
		for(int i:input)
		{
			register[i] = 1;
		}
		
		System.out.println("missing number is");
		
		for(int i=1; i<register.length-1; i++)
		{
			if(register[i]==0)
			{
				System.out.println(i);
			}
		}

	}

}
