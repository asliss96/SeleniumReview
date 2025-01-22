package SeleniumReview1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearchCSSSelector {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		
		//locate elements: 
		 //If I have tag and id: 
			//    tag#id or just #id
		
		//our search box has an id: twotabsearchtextbox
		
		//   input#twotabsearchtextbox --> any input element with this id
		//   #twotabsearchtextbox	   --> any element with this id
		
		
		//If I have tag and class: 
			//  tag.class
		
		//If I just have tag and attributes 
		//		tag[attribute='attribute value'] (difference with xpath: no // and no @ before the attribute)
			  //tag[@attribute='attribute value'] (this is the xpath formula)
		
		WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchBox.sendKeys("deck lights");
		
		Thread.sleep(3000);
		
		//we can use the id: 
		//   #nav-search-submit-button
		
		
		//Even if there is no attribute for an element, we can still locate the element 
		//by locating another element on top of it and then going to our element tag
		
		//For example: we could locate the span element on top of the input: 
				//    tag and id: span#nav-search-submit-text
				// go to the child input element:    span#nav-search-submit-text > input
		
		
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		
		driver.quit();
		

	}

}