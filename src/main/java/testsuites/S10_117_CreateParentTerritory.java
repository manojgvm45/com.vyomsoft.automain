package testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.baseHooks;
import java.time.Duration;

public class S10_117_CreateParentTerritory extends baseHooks{
	
	@Test
	public void createParentTerritory() {
		//4) Click on the App Launcher Icon left to Setup
		driver.findElement(By.xpath("//*[@class='slds-icon-waffle']")).click();
	//5) Click on View All
 		driver.findElement(By.xpath("//button[text()='View All']")).click();
	//6) Click on Service Territories
 		//driver.findElement(By.xpath("//*[@placeholder='Search apps or items...']")).sendKeys("Service Territories");
 		WebElement serviceTerritories = driver.findElement(By.xpath("//*[text()='Service Territories']"));
 		JavascriptExecutor executor = (JavascriptExecutor)driver;
 	    executor.executeScript("arguments[0].click();", serviceTerritories);
	//7) Click on Parent Territory Input field of newly created Service Territory
 	   WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Edit Parent Territory: Item ']")));
		   driver.findElement(By.xpath("//*[text()='Edit Parent Territory: Item ']")).click();
	//8) Under that Click on New Service Territory
	//9) Enter Name as Mukesh Ambani
	//10) Click on Search Operating Hours
	//11) Click New Operating Hours in the DropDown
	//12) Enter Name as Mukesh Ambani
	//13) Select Time as India standard Time(Asia/Kolkata)
	//14) Click on Save
	//15) Verify Name of Operating Hours
	//16) Click on Save
	//17) Verify Whether Parent Territory is Created Successfully
	}
}
