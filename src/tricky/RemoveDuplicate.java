package tricky;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String input = "abbc" ,    output = "";
		//int size = input.length();
		
		for(int i=0; i<input.length(); i++)
		{
			for(int j=0; j<output.length(); j++)
			{
				
				if(input.charAt(i)!= output.charAt(j)) {
					
					output = output + input.charAt(i);
				}
			}
			System.out.println(output);
		}
	}
}
