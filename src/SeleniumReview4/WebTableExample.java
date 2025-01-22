package SeleniumReview4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumReview.utils.BaseClass;

public class WebTableExample extends BaseClass {
	// https://neotech.vercel.app/tables

	public static void main(String[] args) throws InterruptedException {
		setUp();

		// Find the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("The number of rows is -> " + rows.size());

		// Find the number of columns in the first row
		List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("The number of columns is -> " + cols.size());

		// Find the number of all the cells in the table
		List<WebElement> cells = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("The number of cells is -> " + cells.size());

		System.out.println("--------------------------------");

		// If I want to print the first row of the table

		// 1st way, Static way, getting the cells of the first row
		List<WebElement> firstRowList = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		for (WebElement el : firstRowList) {
			System.out.print(el.getText() + " | ");
		}
		System.out.println();

		System.out.println("--------------------------------");
		// 2nd way, Dynamic way, getting the cells of the first row
		for (int i = 1; i <= cols.size(); i++) {
			String path = "//table/tbody/tr[1]/td[" + i + "]";
			// System.out.println(path);

			WebElement el = driver.findElement(By.xpath(path));
			System.out.print(el.getText() + " | ");
		}
		System.out.println();

		System.out.println("--------------------------------");
		System.out.println("Let's print all the cells of all the rows");
		System.out.println("--------------------------------");

		for (int row = 1; row <= rows.size(); row++) { // iterating the rows

			// to skip the last column we said -> col < cols.size();
			for (int col = 1; col < cols.size(); col++) { // iterating the columns
				// String path = "//table/tbody/tr[" + row + "]/td[" + col + "]";
				// System.out.println(path);

				WebElement el = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + col + "]"));
				System.out.println(el.getText());
			}
			System.out.println();

		}

		Thread.sleep(1000);

		tearDown();
	}

}