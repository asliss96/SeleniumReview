package SeleniumReview3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumReview.utils.BaseClass;

public class HandlingFrames extends BaseClass {
	// https://neotech.vercel.app/iframe

	public static void main(String[] args) throws InterruptedException {
		setUp();

		Thread.sleep(1000);

		// You need to switch to the FRAME first
		// driver.findElement(By.id("age")).sendKeys("25");

		// 1st way, switching by index
		// driver.switchTo().frame(0);

		// 2nd way, switching by ID or Name
		// driver.switchTo().frame("age-frame");

		// 3rd way, switching by WebElement
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);

		// After we switch to the iFrame, then we are able to locate the element
		WebElement ageTxt = driver.findElement(By.id("age"));
		ageTxt.sendKeys("25");
		Thread.sleep(1000);
		ageTxt.clear();
		Thread.sleep(1000);
		ageTxt.sendKeys("55");
		Thread.sleep(1000);

		// This will throw and exception NoSuchElementException
		// because the focus is inside the frame
		// but the element is outside of the frame
		// driver.findElement(By.linkText("Nested iframes")).click();

		// We need to switch the focus to the main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Nested iframes")).click();

		Thread.sleep(3000);

		tearDown();

		// HW for middle-class students :)
		// Go to https://the-internet.herokuapp.com/nested_frames
		// Go to the frame with name frameset-middle
		// Go to the frame with index 1
		// Verify the that text of the body is MIDDLE
	}

}
