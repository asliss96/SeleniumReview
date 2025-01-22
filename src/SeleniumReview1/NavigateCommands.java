package SeleniumReview1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	//just practice, makes no difference if it is here or local
	static String url = "https://www.selenium.dev/";
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//open the browser
		WebDriver driver = new ChromeDriver();
		
	//	driver.get(url); //this is what we will use most of the time 
		//1. this will load the webpage for the given url, but it will NOT keep  history
		//2. waits for the page to load
		
		driver.navigate().to(url);
		//1. this will keep history
		//2. it does not wait for the webpage to load
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize(); //will make the browser window full screen
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize(); //will minimize the browser screen

		Thread.sleep(3000);
		
		driver.manage().window().maximize(); //will make the browser window full screen

		
		Thread.sleep(3000);
		
		driver.navigate().to("https://github.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://maven.apache.org/");
		
		Thread.sleep(3000);
		
		driver.navigate().back(); //go one step back (GitHub)
		
		Thread.sleep(3000);
		
		driver.navigate().back(); // go one more step back (Selenium)
		
		Thread.sleep(3000);
		
		driver.navigate().forward(); // go one step forward (GitHub)
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
		
		
	}
	
}
