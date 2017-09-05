package files;

import java.io.File;
import java.io.IOException;

public class Ex1 
{
	public static void main(String[] args) throws IOException 
	{
		File x=new File("d:\\12.xls");
		if(!(x.exists()))
		{
			x.createNewFile();
		}
		if(x.exists())
		{
			System.out.println("file Exists");
		}
		System.out.println(x.getAbsolutePath());
		//x.delete();
		
	}
}
