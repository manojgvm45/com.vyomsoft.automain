package testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.baseHooks;
import java.time.Duration;

public class S10_112_CreateWorktype extends baseHooks{

	@Test(dataProvider = "getData")
	
	public void createWorktype(String worktypegrpname, String desc) {
		
						driver.findElement(By.xpath("//*[@class='slds-icon-waffle']")).click();
 		
		//3.Click View All and click Work Type Groups from App Launcher
				 		
		
		  driver.findElement(By.xpath("//button[text()='View All']")).click();
		  driver.findElement(By.xpath("//*[@placeholder='Search apps or items...']")).
		  sendKeys("work type groups");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		  WebElement workTypeGroups =  driver.findElement(By.xpath("//*[text()='Work Type Groups']"));
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", workTypeGroups);
		 
		//4. Click on the Dropdown icon in the Work Type Groups tab
				 						 	    driver.findElement(By.xpath("//*[text()='New']")).click();
				 	    
		//5. Click on New Work Type Group
		//6. Enter Work Type Group Name as 'Salesforce Automation by Your Name'
				 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
				 		WebElement newWorkType = driver.findElement(By.xpath("//*[@name='Name']"));
				 		newWorkType.sendKeys(worktypegrpname);
				 		//newWorkType.sendKeys("test");
				 		driver.findElement(By.xpath("//*[@class='slds-textarea']")).sendKeys(desc);
				 		//driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
		
		//7. Click save and verify Work Type Group Name
				 		//driver.findElement(By.xpath("//*[@class=' input']")).sendKeys("WorkType2");

		
	}
}
