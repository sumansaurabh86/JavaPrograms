package tricky;

public class VowelCount1 {

	public static void main(String[] args) {
		int vCount=0, cCount=0 , space=0, digit=0;
		String str = "Suman Saurabh 123" ;
		char ch;
		
		int size = str.length();
		str = str.toLowerCase();
		
		for(int i=0; i<size; i++) 
		{
			ch = str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') 
			{
				vCount++;
			}
			else if(ch>='a' && ch<='z') 
			{
				cCount++;
			}
			else if(ch>='0' && ch<='9') 
			{
				digit++;
			}
			else if(ch==' ') 
			{
				space++;
			}
		}
		
		System.out.println("Total no of vowels " + vCount );
		System.out.println("Total no of consonenets " + cCount );
		System.out.println("Total no of Digits " + digit );
		System.out.println("Total no of Spaces " + space );
	}

}
