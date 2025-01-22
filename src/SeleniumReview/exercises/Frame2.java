package SeleniumReview.exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumReview.utils.BaseClass;

public class Frame2 extends BaseClass {
	
	public static void main(String[] args) {
		
		setUp();
		
		driver.switchTo().frame("frame1");
		
		WebElement frame1=driver.findElement(By.id("sampleHeading"));
		
		System.out.println(frame1.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement frame2 = driver.findElement(By.id("sampleHeading"));
		
		System.out.println(frame2.getText());
		
		
		
		
		
		
		
		
		tearDown();
		
	}

}
