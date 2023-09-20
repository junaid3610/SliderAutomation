package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configReader {

	public static Properties getPropertyObject() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\git\\repository4\\SliderAutomation\\Config\\config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	
	}
	
	public static String geturl() throws Exception
	{
		return getPropertyObject().getProperty("url");
	}
	
	public static String getUsername() throws Exception
	{
		return getPropertyObject().getProperty("useraname");
	}
	
	public static String getPassword() throws Exception
	{
		return getPropertyObject().getProperty("password");
	}
	
	
}
