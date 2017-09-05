package files;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ex 
{
	

	public static  void main(String[] args) 
	{
		Properties obj=new Properties();
		obj.load(new FileInputStream(""));
		String strurl=obj.getProperty("URL");
		String strUN=obj.getProperty("username");
		String strPWD=obj.getProperty("password");
		System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	//	ChromeDriver Driver=new ChromeDriver();
		
		
	
	}
}
