package SeleniumReview.exercises;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import SeleniumReview.utils.BaseClass;

public class Droppable extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		driver.switchTo().frame(0);
		
		WebElement draggable=driver.findElement(By.id("draggable"));
		
		WebElement dropable =driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(draggable, dropable).perform();
		
		Thread.sleep(4000);
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		
		try {
			Files.copy(source, new File("screenshot/randomss/droppable.png"));
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("Unable to save the screenshot!");
		}
		
		
		
		
		
		
		
		
		
		tearDown();

	}

}
