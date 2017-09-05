package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Syn 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		FileInputStream x=new FileInputStream("c:\\12.txt");
		FileOutputStream y=new FileOutputStream("c:\\13.txt");
	}
}
