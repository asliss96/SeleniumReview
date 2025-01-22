package SeleniumReview1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2other {

	public static void main(String[] args) throws InterruptedException {
		// Go to https://demoqa.com/text-box
		// Fill the form and submit
		// Use xPath or CSS Selector
		
		String url = "https://demoqa.com/text-box";
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//fill out the information
		
		
		//Full Name: 
			// xpath: 		//input[@id='userName']
			// cssSelector: input#userName or just #userName
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("John Doe");
		
		
		//Email: 
			//xpath: 		//input[@type='email']
			//cssSelector:    input[type='email']
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("john@gmail.com");
		
		//Current Address: 
			//xpath: //textarea[@class='form-control' and @placeholder='Current Address']
			//cssSelector: textarea.form-control
		
		driver.findElement(By.xpath("//textarea[@class='form-control' and "
				+ "@placeholder='Current Address']")).sendKeys("NJ");
		
		//Permanent Address: 
		
		//I could use multiple criteria to locate an element. 
		//Or I can also locate another element close by and then go to the element I need 
		
		
			//xpath: 	//textarea[@class='form-control' and @id='permanentAddress']
						//div[@id='permanentAddress-wrapper']/div[2]/textarea
			//cssSelector: textarea[class='form-control'][id='permanentAddress']
		
		driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']/div[2]/textarea")).sendKeys("NY");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#submit")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}