package SeleniumReview1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		
		//We have 8 locators: id, name, className, linkText, partialLinkText, tagName, xpath, 
		//cssSelector
		
		
		//we could just use the id, but lets practice. 
		
		
		//getting xpath from the browser: 
		//full xpath: 
			// /html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/div/input
		//relative xpath: 
			// //*[@id="twotabsearchtextbox"]
		
		//my own path: 
			// start with the tag:  //input
			// check how many elements identify it
		
		
		//locate the text box
		
		//Step 1: Inspect the element we need to locate
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("deck lights");
		
		Thread.sleep(2000);
		
		
		
		
		//xpath relative path formula: 
			//		//tag[@attribute='attribute value']
		
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchBtn.click();
		
		
		Thread.sleep(2000);

		driver.quit();
		
	}

}
