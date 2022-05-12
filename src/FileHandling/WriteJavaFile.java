package FileHandling;
import java.io.*;
public class WriteJavaFile {

	public static void main(String[] args) 
	{
		
		try
		{
			FileWriter f=new FileWriter("C:\\Users\\suman\\OneDrive\\Desktop\\Khushi.txt");
			try
			{
				f.write("Java Programming is the best Language");
			}
			finally 
			{
				f.close();
			}
			System.out.println("Successfully Data Wrote in File");
		}
		catch (IOException i) 
		{
			System.out.println(i);
		}
	}

}
