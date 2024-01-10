package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

public class GoogleSearchScenario {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//FirefoxProfile options = new FirefoxProfile();
		//options.setPreference("dom.webnotifications.enabled", false);
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriver edgeDriver = new EdgeDriver();
	//	WebDriver driver = new FirefoxDriver();
		//SafariDriver safariDriver = new SafariDriver();
		//OperaDriverManager operaDriver = new OperaDriverManager();


		
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//*[@title='Search']"));
		search.sendKeys("GOT");
		search.sendKeys(Keys.ENTER);

		
		//Shadow shadowDom = new Shadow(driver);
		Thread.sleep(3000);
	 // driver.findElement(By.xpath("//ul[@role='listbox']/li[5]")).click();
	  
	/*List<WebElement>  ele =  driver.findElements(By.xpath("//ul[@role='listbox']/li"));	
	for (WebElement element : ele) {
		System.out.println(element.getText());
		String allElements = element.getText();
		System.out.println(allElements); */

//		for (int i=0; i<allElements.length()-1; i++) {
//			
//		}
	 
	  
	// WebElement ele=driver.findElement(By.xpath("//*[text()='All']"));
	 	 String parentWindow = driver.getWindowHandle();

		WebElement ele=driver.findElement(By.xpath("//*[normalize-space(text())='Game of Thrones']"));
	 Thread.sleep(3000);
	  Actions action = new Actions(driver);
		action.contextClick(ele).keyDown(Keys.ARROW_DOWN).perform();
		//.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	 	 Robot robot = new Robot();
	 	 robot.keyPress(KeyEvent.VK_DOWN);
	 	 robot.keyPress(KeyEvent.VK_DOWN);
	 	 robot.keyRelease(KeyEvent.VK_DOWN);
	 	 robot.keyPress(KeyEvent.VK_ENTER);
	 	 robot.keyRelease(KeyEvent.VK_ENTER);
	 	 
	 	 Set<String> allWindows = driver.getWindowHandles();
	 	 
	 	 for(String window : allWindows) {
	 		 driver.switchTo().window(window);
	 		 if (!window.equals(parentWindow)) {
	 			 driver.switchTo().window(window);
	 			// driver.close();
	 		 }
	 		 
	 	 }
	 	 
		System.out.println("done");
		
		

		}
		
	
	}


