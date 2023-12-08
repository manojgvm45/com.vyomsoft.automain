package testNGbootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditDashboard {

	public static void main(String[] args) {
		// TODO Edit dashboard in salesforce
		
		// WebDriver driver = new ChromeDriver();
		 //ChromeOptions ops = new ChromeOptions();
		  //ops.addArguments("--disable-notifications");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		 		 driver.get("https://testleaf-5e-dev-ed.develop.my.salesforce.com/");
		 		 driver.manage().window().maximize();
		 		 driver.findElement(By.id("username")).sendKeys("manojgvm45@testleaf.com");
		 		 driver.findElement(By.id("password")).sendKeys("Vyomisuga@45");
		 		 driver.findElement(By.id("Login")).click();
		 		driver.findElement(By.xpath("//*[@class='slds-icon-waffle']")).click();
		 		
	}

}
