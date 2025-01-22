package SeleniumReview4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import SeleniumReview.utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass {
	// https://neotech.vercel.app/waits

	public static void main(String[] args) throws InterruptedException {
		setUp();

////////////////////////////////////////////////////////////////		
//		// WebDriverWait
//		driver.findElement(By.id("btnStartDownload")).click();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Complete!']")));
//
//		// Wait until the element is visible
//		// Wait for a maximum of 25 seconds
//
//		WebElement div = driver.findElement(By.xpath("//div[text()='Complete!']"));
//		System.out.println("The text of the div is -> " + div.getText());
////////////////////////////////////////////////////////////////

		// FluentWait
		driver.findElement(By.id("btnStartDownload")).click();

		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
		fluentWait.withTimeout(Duration.ofMinutes(1)); // Maximum wait is van minut
		fluentWait.pollingEvery(Duration.ofSeconds(3)); // Try every 3 seconds
		fluentWait.ignoring(NoSuchFieldException.class); // While trying ignore this exception

		// I will wait for button with text Close to in page and Clickable
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Close']")));

		// Now we know that Close button is clickable
		driver.findElement(By.xpath("//button[text()='Close']")).click();

		Thread.sleep(2000);

		tearDown();
	}

}
