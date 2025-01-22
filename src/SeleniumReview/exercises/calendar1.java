package SeleniumReview.exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumReview.utils.BaseClass;

public class calendar1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		//select from and to 
		//date 2025 July 24
		//click search buses
		
		setUp();
		Thread.sleep(2000);
		
	WebElement from= driver.findElement(By.cssSelector("#src"));
	
	from.sendKeys("Vancouver");
	
	WebElement to = driver.findElement(By.cssSelector("#dest"));
	
	to.sendKeys("Brandon CA, Canada");
	
	driver.findElement(By.id("onward_cal")).click(); //clicking on the date
	
	
	//WebElement monthyear=driver.findElement(By.xpath("//*[@id=\"rdc-root\"]/div/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]"));
	//String currentDate=Jan.getText();
	//System.out.println(Jan.getText());
	
	String expectedDate = "July 2025";
	
	while(true) 
	{
		String monthyear=driver.findElement(By.xpath("//*[@id=\"rdc-root\"]/div/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]")).getText();
	    
		
		
		if(monthyear.equals(expectedDate))
		{
			break;
		}
		else
		{
			driver.findElement(By.id("next")).click(); 
		}
	}
       Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"rdc-root\"]/div/div[1]/div[2]/div[2]/div/div/div[1]/span/span[6]/div[2]/span")).click();
	
	Thread.sleep(2000);
	


	
	
	
	
	
	
	
	
	//driver.findElement(By.id("next")).click(); //clicking on next
				
		
		
		
		
		
		
		
		tearDown();

	}

}
