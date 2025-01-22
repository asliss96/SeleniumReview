

package SeleniumReview1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the Firefox browser
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.nytimes.com/";
		
		driver.get(url);
		
		Thread.sleep(5000); //Wait (stop the code from running) for 5 seconds
		
		//get the current url
		String currentUrl = driver.getCurrentUrl();
		
		
		if (url.equals(currentUrl))
		{
			System.out.println("Url's are the same!");
		}
		else 
		{
			System.out.println("Url's are different!");
		}
		
		//get the webpage title
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		
		driver.quit();
		

	}

}
