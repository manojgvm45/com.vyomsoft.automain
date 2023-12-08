package testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.baseHooks;
import java.time.Duration;
public class S10_016_EditDashboard extends baseHooks {

	@Test
	public void editDashboard() throws InterruptedException {
		
					driver.findElement(By.xpath("//*[@class='slds-icon-waffle']")).click();
			 		
	//3. Click View All and click Dashboards from App Launcher
			 		
			 		driver.findElement(By.xpath("//button[text()='View All']")).click();
			 		driver.findElement(By.xpath("//*[@placeholder='Search apps or items...']")).sendKeys("dashboard");

	//4. Click on the Dashboards tab
			 		
			 		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();

	//5. Search the Dashboard 'Salesforce Automation by Your Name'
			 		
			 		//driver.findElement(By.xpath("//*[@placeholder='Search recent dashboards...']")).sendKeys("Test_Dashboard_1");
			 		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 		
	//6. Click on the Dropdown icon and Select Edit
			 		
			 	/*	WebElement dashBoard = driver.findElement(By.xpath("//*[text()='Test_Dashboard_1']"));
			 		JavascriptExecutor executor = (JavascriptExecutor)driver;
			 	    executor.executeScript("arguments[0].click();", dashBoard);
			 	    			 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 		List<WebElement> listFrame = driver.findElements(By.tagName("iframe"));
			 		int size = listFrame.size();
			 		System.out.println(size);
			 		
			 		driver.switchTo().frame("0");
			 		driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral edit']")).click(); */
			 	   
			 		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search recent dashboards...']"));
					search.click();
					search.sendKeys("Test_Dashboard_1");
					search.sendKeys(Keys.ENTER);
					Thread.sleep(6000);
					driver.findElement(By.xpath("//tr//th//a[@title='Test_Dashboard_1']/../../../../../following-sibling::td//*[@class='slds-button slds-button_icon-border slds-button_icon-x-small']")).click();
			 		driver.findElement(By.xpath("//span[text()='Edit']")).click();
					

			 	   	//7.Click on the Edit Dashboard Properties icon
					Thread.sleep(6000);
					driver.switchTo().frame(0);
			 		//driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral edit']")).click();
			 		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div[2]/div[1]/div/button[3]")).click();
			 		
	//8. Enter Description as 'SalesForce' and click on save.
			 		driver.findElement(By.xpath("//*[@id='dashboardNameInput']")).sendKeys("Test_Dashboard_1");
			 		WebElement dashboardDesc = driver.findElement(By.xpath("//*[@id='dashboardDescriptionInput']"));
			 		dashboardDesc.clear();
			 		dashboardDesc.sendKeys("SalesForce");
			 		driver.findElement(By.xpath("//span[text()='Another person']")).click();
			 		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
			 		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='submitBtn']")));
			 		driver.findElement(By.xpath("//*[@id='submitBtn']")).click();
			 		//driver.findElement(By.xpath("//*[@class='slds-button slds-button_icon-inverse slds-button_icon slds-modal__close']")).click();
	//9. Click on Done and  Click on save in the popup window displayed.
//			 		driver.findElement(By.xpath("//*[@class='slds-button doneEditing']")).click();
//			 		driver.findElement(By.xpath("//*[@id='modalBtn2']")).click();
			 		//driver.findElement(By.xpath("//*[@class='slds-button slds-button_neutral save']")).click();
			 		Thread.sleep(3000);
			 		driver.findElement(By.xpath("//button[text()='Save']")).click();
			 		//Thread.sleep(3000);
			 		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
					//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']")));
			 		Thread.sleep(1000);
					String editDBmsg = driver.findElement(By.xpath("//*[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']")).getText();
			System.out.println(editDBmsg);

		}

}
