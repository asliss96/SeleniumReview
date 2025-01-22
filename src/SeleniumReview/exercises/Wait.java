package SeleniumReview.exercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumReview.utils.BaseClass;

public class Wait extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/**
		 *  Open chrome browser
		 Go to "https://neotech.vercel.app/" 
		 Click on the "Interactions" link 
		 Then click on "Waits"
		 Click on enable button 
		 Enter "Hello" and verify text is entered successfully 
		 Close the browser
		 */
		
		
		setUp();
		
		driver.findElement(By.id("menu-interactions")).click();
		
		driver.findElement(By.xpath("//*[@id=\"waits\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"btnEnable\"]")).click();
		


		WebElement box=driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(box));
		
		
		
		
		box.sendKeys("Hello");
		 Thread.sleep(4000);
		
		
		
		
		
		
		tearDown();
	}
  
  
  
  
}
