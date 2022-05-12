package FileHandling;

import java.io.*;
import java.io.IOException;

public class PrintWriterFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\suman\\OneDrive\\Desktop\\File Handeling\\AlkaFile.txt");
		
		
			try {
				
				if(!file.exists())
				{
				file.createNewFile();
				}
				PrintWriter pw = new PrintWriter(file);
				pw.println("This is my new file");
				pw.println("File location is Desktop");
				pw.close();
				System.out.println("Done");
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
