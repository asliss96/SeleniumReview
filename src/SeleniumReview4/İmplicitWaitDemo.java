package SeleniumReview4;

import java.time.Duration;

import org.openqa.selenium.By;

import SeleniumReview.utils.BaseClass;

public class İmplicitWaitDemo extends BaseClass {
	// https://neotech.vercel.app/waits

	public static void main(String[] args) throws InterruptedException {
		setUp();

		// Implicit Wait
		// Always done RIGHT AFTER the creation of the driver
		// Valid throughout the lifetime of the driver
		// Will be in effect for all elements
		// I will wait for a maximum of 20 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("btnStartDownload")).click();

		driver.findElement(By.xpath("//div[text()='Complete!']"));

		Thread.sleep(2000);

		tearDown();
	}

}
