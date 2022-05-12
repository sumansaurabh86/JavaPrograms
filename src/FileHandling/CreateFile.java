package FileHandling;
import java.io.*;
public class CreateFile {
	
	public static void main(String[] args)
	{
		File f=new File("C:\\Users\\suman\\OneDrive\\Desktop\\File Handeling\\Khushi.txt");	
		
		try
		{
		if(f.createNewFile())
		{
			System.out.println("File Successfully Created");
		}
		else 
		{
			System.out.println("File Aready Exist");
		}
		}
		catch(IOException i)
		{
			System.out.println("Exception handled");
		}
		
	}
	
	

}
