package SeleniumReview3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import SeleniumReview.utils.BaseClass;

public class HarryPotterSearch extends BaseClass

{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();

		Thread.sleep(1000);

		WebElement selectDDElement = driver.findElement(By.id("searchDropdownBox"));

		Select selectDD = new Select(selectDDElement);

		// Print all the options of the drop-down
//		List<WebElement> optionList = selectDD.getOptions();
//		for (WebElement option : optionList) {
//			System.out.println(option.getText());
//		}

		// 3 different ways to select one of the drop-down options
		// selectDD.selectByIndex(3);
		// selectDD.selectByValue("search-alias=baby-products");
		selectDD.selectByVisibleText("Books");
		Thread.sleep(1000);

		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));

		searchTxt.sendKeys("Thais");
		Thread.sleep(1000);
		searchTxt.clear();
		Thread.sleep(1000);
		searchTxt.sendKeys("Harry Potter");
		Thread.sleep(1000);

		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.submit();
		Thread.sleep(1000);

		List<WebElement> elementList = driver.findElements(By.xpath("//li[@class='a-spacing-micro']"));

		System.out.println("There are -> " + elementList.size() + " <- elements");

		// This exception is a nightmare -> StaleElementReferenceException
				// Happens when you click, and don't break the loop
				for (WebElement el : elementList) {
					String elementText = el.getText();

					if (elementText.equals("Kindle Unlimited Eligible")) {
						el.click();
						break;
					}
				}

				Thread.sleep(2000);

				tearDown();

	}

	}
		
	
	
	