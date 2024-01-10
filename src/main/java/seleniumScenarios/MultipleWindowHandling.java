package seleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import JavaPractice.OccuranceString;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

public class MultipleWindowHandling extends OccuranceString{
	
	public WebDriver driver;
	public String homeWindow;
	public Set<String> allWindows;
	public String homeWindowTitle;
	public void setBrowser() throws AWTException {
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Homewindow-
		driver.findElement(By.xpath("//span[text()='Browser']/parent::a")).click();
		Actions action = new Actions(driver);
		Robot robot = new Robot();
		//open second window from first window-alert window
		WebElement alertWindow = driver.findElement(By.xpath("//span[text()='Alert']/parent::a"));
		action.contextClick(alertWindow).perform();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//open 3rd window from first window-frame window
		
		WebElement browserWin = driver.findElement(By.xpath("//span[text()='Frame']/parent::a"));
		action.contextClick(browserWin).perform();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	 homeWindow = driver.getWindowHandle();
	 homeWindowTitle = driver.switchTo().window(homeWindow).getTitle();
		 allWindows = driver.getWindowHandles();
		System.out.println("Windows are opened");
		
		
		
	}
	
	public void windowHandle1() throws InterruptedException {
		
		// Scnearion1 : Open 3 windows ; come back to home window ; do some operations; again go to third window and do some operations;
		
		//Do some operation in home window
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Window']/parent::a")).click();
		WebElement ele = driver.findElement(By.xpath("(//h5)[5]"));
		String homeWindowString = ele.getText();
		System.out.println("HomeWindow: "+ homeWindowString);
		for (String window : allWindows) {
			String windowTitles = 	driver.switchTo().window(window).getTitle();
			System.out.println("setString" + allWindows.add(windowTitles));
			if (!window.equals(homeWindowTitle)) {
				driver.switchTo().window(window);
				Thread.sleep(6000);
			}
			
			System.out.println("Window Titles: " + windowTitles);
		}
		
				
				
	}

	public static void main(String[] args) {
		MultipleWindowHandling window =new MultipleWindowHandling();
		try {
			window.setBrowser();
			window.windowHandle1();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}

}
