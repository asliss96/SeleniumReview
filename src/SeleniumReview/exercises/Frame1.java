package SeleniumReview.exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import SeleniumReview.utils.BaseClass;

public class Frame1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * 1) Launch the browser and open the site "https://neotech.vercel.app/iframe/multi2"
2) Verify on the page header "Not a Friendly Topic" displayed
3) Click on the Inner Frame Check box
4) Choose Dog from Animals dropdown
5) Quit the browser
		 */
        setUp();
        
        WebElement title =driver.findElement(By.xpath("/html/body/div[2]/main/div/h2/label/span"));
        
        System.out.println(title.getText());
        
        driver.switchTo().frame("nested1");
        
      driver.switchTo().frame("child-frame");
       
       driver.findElement(By.id("inner-frame-check-box")).click();
       
       driver.switchTo().defaultContent();
       
       driver.switchTo().frame("animals");
       
       Select options= new Select (driver.findElement(By.id("animal-select")));
       
       options.selectByVisibleText("Dog");
       
       Thread.sleep(3000);
       
       Thread.sleep(3000);
        
        
        
        
        
        
        
        tearDown();
	}

}
