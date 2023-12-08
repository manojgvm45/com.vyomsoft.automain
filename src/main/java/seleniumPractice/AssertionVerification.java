package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionVerification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/button.xhtml");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Click']")).click();
		Thread.sleep(1000);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, pageTitle, "DashBoard");		
	}

}
