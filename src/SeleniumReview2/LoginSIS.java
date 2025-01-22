package SeleniumReview2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumReview.utils.BaseClass;
import SeleniumReview.utils.ConfigsReader;

public class LoginSIS extends BaseClass {

	// Login to SIS Web Application
	// https://sis.neotechacademy.com/
	// username -> Admin
	// password -> Neotech$123

	public static void main(String[] args) throws InterruptedException {
		setUp();

		// We are performing our test
		Thread.sleep(1000);

		WebElement username = driver.findElement(By.id("tUsername"));
		username.sendKeys(ConfigsReader.getProperty("username")); // Admin
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.name("tPassword"));
		password.sendKeys(ConfigsReader.getProperty("password")); // Neotech$123
		Thread.sleep(1000);

		// The input whose type attribute has the value of submit
		driver.findElement(By.xpath("//input[@type='submit']")).click(); // Method chaining
		Thread.sleep(3000);

		tearDown();
	}

}	
