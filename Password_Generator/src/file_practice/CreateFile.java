package file_practice;

import java.io.File;
import java.io.IOException;

public class CreateFile
{

	

	
	public  CreateFile(String filename) 
	{
		File file = new File(filename);
		
		if(!file.exists()) 
		{
			try {
				file.createNewFile();
				System.out.println("File has been created");

			}
			
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
