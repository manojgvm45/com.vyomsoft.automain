package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;
import utils.ExcelUtility;

public class baseHooks {

	public WebDriver driver;
	//String[][] testData = null;
	@DataProvider (name = "getData")
	public String[][] getExcelData() {
		
		String[][] testData = ExcelUtility.readExcelValue();
		System.out.println(testData);
		return testData;
		
	}
	
	@BeforeClass
	//Launch The Chrome Browser
	public void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver = new ChromeDriver(options);
		 		 driver.get("https://testleaf-5e-dev-ed.develop.my.salesforce.com/");
		 		 driver.manage().window().maximize();
		 		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	@BeforeMethod
	public void logIn() {
		// 1. Login to https://login.salesforce.com
			 		 
			 		driver.findElement(By.id("username")).sendKeys("manojgvm45@testleaf.com");
			 		 driver.findElement(By.id("password")).sendKeys("Vyomisuga@45");
			 		 driver.findElement(By.id("Login")).click();
	}
	@AfterTest
	 public void closeBrwoser() {
		 //driver.close();
	 }
}

