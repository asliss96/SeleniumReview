package SeleniumReview.exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumReview.utils.BaseClass;

public class Date extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		Thread.sleep(2000);
		
		//let's select 18 september 2026
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click(); //clicking on the date picker
		
		String day ="18";
		String month="September";
		String year="2026";
		
	
		
		////div[@class='ui-datepicker-title']- month year together
		
		//span[@class='ui-datepicker-month']
		//span[@class='ui-datepicker-year']
		
		while(true) 
		{
		  String currentmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		  String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		  
		  if(currentmonth.equals(month)&& currentyear.equals(year)) 
		  {
			  break;
		  }
		  	driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		
		Thread.sleep(4000);
		
		
		////table[@class='ui-datepicker-calendar']//tbody//td - datas
		
		List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
		
		
		for(WebElement dt:dates) 
		{
			if(dt.getText().equals(day)) 
			{
				dt.click();
				break;
			}
		}
		
		System.out.println();
		
		Thread.sleep(4000);
		
		tearDown();

	}

}
