package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) {
		
		try
		{
			FileReader r = new FileReader("C:\\Users\\suman\\OneDrive\\Desktop\\File Handeling\\Khushi.txt");
			
			try
			{
				int i;
				while((i=r.read())!=-1)	//read() method read the data character by character and
										//returns the value in the forms of integer
				{
					System.out.print((char)i);	// i will give the ASCII value hence type casting is done by char(i)
				}
			}
			finally
			{
				r.close();
			}
		}
		catch(IOException e)
		{
			System.out.print("Exception handled");
		}

	}

}
