package SeleniumReview4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumReview.utils.BaseClass;

public class PrintTableDemo extends BaseClass {
	// Go to https://the-internet.herokuapp.com/tables
	// I want you to print all the data from the tbody of the second table
	// Create the path dynamically
	// Don't print the last column

	public static void main(String[] args) throws InterruptedException {
		setUp();

		// The number of rows
		int rows = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr")).size();
		int cols = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td")).size();

		for (int i = 1; i <= rows; i++) {
			// iterating the rows

			for (int j = 1; j < cols; j++) { // skipping the last column
				// iterating the columns

				WebElement el = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(el.getText() + " | ");
			}
			System.out.println();

		}

		Thread.sleep(1000);

		tearDown();
	}

}