package SeleniumReview3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import SeleniumReview.utils.*;

public class AlertDemo extends BaseClass {
	// https://neotech.vercel.app/alerts

	public static void main(String[] args) throws InterruptedException {
		setUp();

		Thread.sleep(1000);

		driver.findElement(By.id("btnAlert")).click();

		// When alert is open, you cannot interact with the main page
		// driver.findElement(By.id("btnPrompt")).click();

		// We need to take care of the Alert (JavaScript pop-up)
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);

		System.out.println("The text of the alert is -> " + alert.getText());

		alert.accept(); // Clicking on OK
		Thread.sleep(1000);

		// After accept/dismiss the alert, we can interact with the main page
		driver.findElement(By.id("btnPrompt")).click();
		Thread.sleep(1000);

		Alert prompt = driver.switchTo().alert();

		// There are 4 methods we can use
		// prompt.getText(); Gets the text from the Alert
		// prompt.sendKeys("Everest"); Sends text to the Alert
		// prompt.accept(); Clicking on OK
		// prompt.dismiss(); Clicking on Cancel

		prompt.sendKeys("Everest");
		prompt.accept();

		Thread.sleep(3000);
		tearDown();
	}

}
