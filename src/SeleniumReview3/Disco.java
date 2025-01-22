package SeleniumReview3;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import SeleniumReview.utils.BaseClass;

public class Disco extends BaseClass {
	// https://neotech.vercel.app/windows

	public static void main(String[] args) throws InterruptedException {
		setUp();

		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);

		Set<String> allWindows = driver.getWindowHandles();

		Iterator<String> it = allWindows.iterator();
		String handle1 = it.next();
		String handle2 = it.next();

		for (int i = 1; i <= 10; i++) {
			driver.switchTo().window(handle1);
			Thread.sleep(400);
			driver.switchTo().window(handle2);
			Thread.sleep(400);
		}

		driver.close(); // Will close ONLY the current tab/Window
		Thread.sleep(3000);

		// driver.quit(); // Will close ALL the open tabs/Windows

		tearDown(); // Here we are using --> driver.quit();

		// HW only for good students
		// Click all the buttons
		// Then close them, one by one
	}

}
