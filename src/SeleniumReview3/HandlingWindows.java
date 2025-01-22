package SeleniumReview3;

import java.util.Set;
import org.openqa.selenium.By;
import SeleniumReview.utils.BaseClass;

public class HandlingWindows extends BaseClass {
	// https://neotech.vercel.app/windows

	public static void main(String[] args) throws InterruptedException {
		setUp();

		Thread.sleep(1000);

		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		// chrome -> 56838EC948394FE8A40EF0B8EC68FD49
		// chrome -> D8922881B1115F36835A10B754F17A5F
		// firefox -> 57f2fba5-9b43-4f8f-bb8b-388d1f2aa94c
		// firefox -> 8a9adef7-38ab-45d5-bc13-5a517938cabd

		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);

		System.out.println("--------------------------------");

		// I am NOT able to locate the elements. The focus is still on the first page.
		// driver.findElement(By.name("q")).sendKeys("Vanessa is the best!");

		// This will still give me the handle of the first page
		// driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		for (String windowId : allWindows) {
			System.out.println(windowId);

			if (!windowId.equals(window1)) {
				// If the windowId is NOT equal to the first Window ID
				driver.switchTo().window(windowId);
				break;
			}
		}

		// Now I am able to locate the elements. The focus is on the second page.
		driver.findElement(By.name("q")).sendKeys("Vanessa is the best!");
		Thread.sleep(3000);
		
		// HW for iterator-loving students
		// Switch the window using iterator

		tearDown();
	}

}
