package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01jgef44cj8isug9ougvjvmzc0662367.node0");
		Thread.sleep(3000);
		WebElement dragBox =  driver.findElement(By.id("form:drag_content"));
		WebElement dropBox = driver.findElement(By.id("form:drop_content"));
		
		Actions actions = new Actions(driver);
		//method:1
		//actions.clickAndHold(dragBox).moveToElement(dropBox).build().perform();
		//method:2
		actions.dragAndDrop(dragBox, dropBox).build().perform();
		
		
	}
}
