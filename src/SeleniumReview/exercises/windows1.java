package SeleniumReview.exercises;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import SeleniumReview.utils.BaseClass;

public class windows1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
    /**
     * 1) Launch the browser and open the site "https://neotech.vercel.app/email"
2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
3) On the Child Window, Enter your email ID and submit.
4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
5) Close the Child window on which credentials are displayed. Switch to the parent window.
6) Quit all browsers
     */
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String mainWindow=driver.getWindowHandle();
		
		Set<String> allwindows=driver.getWindowHandles();
		
	     Iterator<String> it =allwindows.iterator();
	     
	     String firstone =it.next();
	     
	    String secondone =it.next();
	    
	    driver.switchTo().window(secondone);
	    
	    driver.findElement(By.id("emailid")).sendKeys("asli@gmail.com");
	    
	    driver.findElement(By.id("btnLogin")).click();
	    
	    Thread.sleep(4000);
	    
	    driver.close();
	    
	    driver.switchTo().window(mainWindow);
	
	    Thread.sleep(4000);
		
		
		
		
		
		
		
		
		tearDown();
		

	}

}
