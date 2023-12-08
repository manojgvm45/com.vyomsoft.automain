package testNGbootcamp;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;


public class S10_016_EditDashboard_Trail {

	
		//Launch The Chrome Browser
		WebDriver driver;
		@DataProvider
		public static String[][] readExcelValue() {
			String[][] data = null;
			try {
				XSSFWorkbook workBook = new XSSFWorkbook("./data/Login_Credentials.xlsx");
				XSSFSheet sheet = workBook.getSheetAt(0);
				XSSFRow row = sheet.getRow(0);
				int rowCount = sheet.getLastRowNum();
				int colCount = row.getLastCellNum();
				data = new String[rowCount][colCount];
				for (int i = 1; i <= rowCount; i++) {
					for (int j = 0; j < colCount; j++) {
						XSSFCell cell = sheet.getRow(i).getCell(j);
						data[i-1][j] = cell.getStringCellValue();
					}
				}
				workBook.close();
				System.out.println(data);

			} catch (IOException e) {
				e.printStackTrace();
			}
			return data;
		}
		
			@BeforeTest
		
			
			
			//@BeforeClass
			@Test(dataProvider = "readExcelValue")
			public void logIn(String uname,String pwd) {
		// 1. Login to https://login.salesforce.com
			 		 
			 		driver.findElement(By.id("username")).sendKeys(uname);
			 		 driver.findElement(By.id("password")).sendKeys(pwd);
			 		 driver.findElement(By.id("Login")).click();
			}
		//2. Click on the toggle menu button from the left corner
			 @Test		 
			public void editDashboard() {	 	
			driver.findElement(By.xpath("//*[@class='slds-icon-waffle']")).click();
				 		
		//3. Click View All and click Dashboards from App Launcher
				 		
				 		driver.findElement(By.xpath("//button[text()='View All']")).click();
				 		driver.findElement(By.xpath("//*[@placeholder='Search apps or items...']")).sendKeys("dashboard");

		//4. Click on the Dashboards tab
				 		
				 		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();

		//5. Search the Dashboard 'Salesforce Automation by Your Name'
				 		
				 		driver.findElement(By.xpath("//*[@placeholder='Search recent dashboards...']")).sendKeys("Test_Dashboard_1");
				 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//6. Click on the Dropdown icon and Select Edit
				 		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
				 		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[//a/span[text()='Test_Dashboard_1']]")));
				 		driver.findElement(By.xpath("//*[//a/span[text()='Test_Dashboard_1']]")).click();
				 		

		//7.Click on the Edit Dashboard Properties icon
				 		
				 		
		//8. Enter Description as 'SalesForce' and click on save.
		//9. Click on Done and  Click on save in the popup window displayed.
		//10. Verify the Description."Expected Result:The Dashboard is Edited Successfully"
			}
			 @AfterTest
			 public void closeBrwoser() {
				 //driver.close();
			 }
	
}
