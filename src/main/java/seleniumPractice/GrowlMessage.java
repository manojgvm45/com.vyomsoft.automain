package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class GrowlMessage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/messages.xhtml");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h5[text()='Growl']/following::form/button/span[text()='Info']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Print2");
		String text = driver.switchTo().alert().getText();
		System.out.println("textprint" + text);

	}

}
