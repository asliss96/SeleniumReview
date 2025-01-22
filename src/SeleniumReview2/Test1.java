package SeleniumReview2;

import SeleniumReview.utils.ConfigsReader;
import SeleniumReview.utils.Constants;

public class Test1 {

	public static void main(String[] args) {
		
		//I will store my file path in constants class
		
		//String filePath = System.getProperty("user.dir")+ "/configs\\conf.properties";
		
		//System.out.println(filePath);
		
		//System.out.println(Constants.CONFIGURATION_FILEPATH);
		
		ConfigsReader.readProperities(Constants.CONFIGURATION_FILEPATH);
		
		String browser =ConfigsReader.getProperty("browser");
		
		System.out.println(browser);
		
		System.out.println(ConfigsReader.getProperty("password"));

	}

}
