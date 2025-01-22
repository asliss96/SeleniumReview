package SeleniumReview1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2me {

	public static void main(String[] args) throws InterruptedException {
		// Go to https://demoqa.com/text-box
				// Fill the form and submit
				// Use xPath or CSS Selector
		
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("Asli Saracoglu Gurpinar");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("asli@gmail.com");
		driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("Vancouver");
		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Istanbul");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#submit")).click();
		
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
