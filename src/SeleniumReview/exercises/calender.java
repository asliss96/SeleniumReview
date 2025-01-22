package SeleniumReview.exercises;

import org.openqa.selenium.By;

import SeleniumReview.utils.BaseClass;

public class calender extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();
		
		Thread.sleep(2000);
		
		//April 2025 15
		
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[3]")).click();
		
		String year= "2026";
		String month= "10";
		String date = "7";
		
		
		
		
		
		
		//String head=driver.findElement(By.xpath("//*[@id=\"departure\"]/div[3]/div/div[1]/div/table/thead/tr[1]/th[2]")).getText();
		
		
		while (true) 
		{ 
			
			String monthyear=driver.findElement(By.xpath("//div[@class='calendar-right']//tr//th[@class='current']")).getText();
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equals(month) && yr.equals(year)) 
			{
			break;
		}			
			else
			{
				driver.findElement(By.xpath("//div[@class='calendar-right']//tr//th[@class='next']")).click();
			}
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		tearDown();
		
	}
	

}
