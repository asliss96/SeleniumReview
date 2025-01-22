package SeleniumReview.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	
    private static	Properties prop;
    
    /**
	 * This method will read the properties file
	 * 
	 * @param filePath
	 */
	
	public static void readProperities (String filePath)
	{
		
		try {
			FileInputStream fis =new FileInputStream(filePath);
		    prop = new Properties ();
			prop.load(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("The file path is wrong");
			
		} catch (IOException e) {
			System.out.println("I can't read the file");
		}
	}
	
	/**
	 * This method will return the value for the specified key
	 * 
	 * @param key
	 */
	
	
	public static String getProperty (String key)
	{
		return prop.getProperty(key);
		
		
		
	}

}
