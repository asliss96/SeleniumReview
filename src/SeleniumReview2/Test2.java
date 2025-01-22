package SeleniumReview2;

import org.openqa.selenium.By;

import SeleniumReview.utils.BaseClass;

public class Test2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// Preparing for the test
		setUp();

		// Do our test
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("hazal@neotech.com");
		Thread.sleep(2000);

		// Clean up everything
		tearDown();

	}

}
