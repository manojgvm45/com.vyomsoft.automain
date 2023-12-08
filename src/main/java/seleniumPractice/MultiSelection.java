package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class MultiSelection {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		Thread.sleep(3000);
		WebElement dropDown = driver.findElement(By.xpath("//input[@placeholder='Choose Course']"));
		dropDown.sendKeys("S");
		//Thread.sleep(1000);
		List<WebElement> selectList = driver.findElements(By.xpath("//*[@role='listbox']/ul"));
			//	dropDown.findElements(By.tagName("li"));
		for (WebElement selectCourse : selectList) {
			if(selectCourse.getText().equals("PostMan")) {
				selectCourse.click();
				break;
			}
			
		}
	}

}
