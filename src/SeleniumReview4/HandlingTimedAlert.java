package SeleniumReview4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumReview.utils.BaseClass;

public class HandlingTimedAlert extends BaseClass {
	// https://neotech.vercel.app/alerts

	public static void main(String[] args) throws InterruptedException {
		setUp();

//		driver.findElement(By.id("btnAlert")).click();
//		Thread.sleep(1000);
//
//		// Handling the Alert
//		Alert alert = driver.switchTo().alert();
//		System.out.println("The text of the alert is -> " + alert.getText());
//		alert.accept();
//		Thread.sleep(1000);

		// Handling the Delayed Alert
		driver.findElement(By.id("btnDelayedAlert")).click();

		// Exception -> NoAlertPresentException: no such alert
		// The Alert is NOT present yet
		// Alert alert = driver.switchTo().alert();

		// This king of waiting is not good
		// Because I don't want to wait for too long
		// Thread.sleep(10000);
		// Alert alert = driver.switchTo().alert();

		// I want to wait for the Alert to be present
		// Wait for a maximum of 30 Seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());

		// If the Alert is present in 2 seconds, I will wait ONLY 2 seconds
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000); // I want to see the Alert for 1 second

		alert.accept();
		Thread.sleep(2000); // I want to see the page after the alert is closed

		tearDown();
	}

}
