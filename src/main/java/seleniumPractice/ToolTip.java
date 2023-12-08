package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");
		Thread.sleep(3000);
		WebElement toolTip =  driver.findElement(By.id("firstname"));
		String tip = toolTip.getAttribute("title");
		System.out.println(tip);
		
	}

}
