package seleniumScenarios;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class DynamicWebtableExport {

	public ChromeOptions chromeOptions;
	public WebDriver driver;
	
	
	public void setBrowser() throws InterruptedException {
		//Goto the reports path
		
		chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://testleaf-5e-dev-ed.develop.lightning.force.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("manojgvm45@testleaf.com");
		 driver.findElement(By.id("password")).sendKeys("Vyomisuga@45");
		 driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//*[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
 		driver.findElement(By.xpath("//*[@placeholder='Search apps or items...']")).sendKeys("Reports");
 		driver.findElement(By.xpath("//mark[text()='Reports']")).click();
 		Thread.sleep(3000);
 		WebElement newOpporReport = driver.findElement(By.xpath("//a[@title='New Opportunities Report']"));
 		JavascriptExecutor js = (JavascriptExecutor)driver;
 		js.executeScript("arguments[0].click();", newOpporReport);
 		Thread.sleep(10000);
 		driver.switchTo().frame(0);
 		//driver.findElement(By.xpath("(//span[text()='More Actions']/ancestor::div/button)[2]")).click();
 		//driver.findElement(By.xpath("//span[text()='Export']/parent::a")).click();
 		//driver.findElement(By.xpath("//span[text()='Export']")).click();
 		Thread.sleep(3000);
 		
	}
	
	public void getReportValues() {
		
	
		//Object[][] data = null;
		List<WebElement> oppElement = driver.findElements(By.xpath("(//col[@class='data-grid-table-col']/following::tbody)[2]/tr"));
		int oppEleSize = oppElement.size();
		List<WebElement> colElement  = driver.findElements(By.xpath("(//col[@class='data-grid-table-col']/following::tbody)[2]/tr[2]/td"));
		int colEleSize = colElement.size();
		System.out.println("print1 :" +colEleSize);
		List<LinkedHashMap<String, String>>  allWebTable = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> webTable = null;
		
		System.out.println(oppEleSize);
		for(int i=1; i<oppEleSize+1; i++) {
		//	String rowXpath = "(//col[@class='data-grid-table-col']/following::tbody)[2]/tr["+i+"]";
		//	String rowValue = driver.findElement(By.xpath(rowXpath)).getText();
			String headerXpath = "(//col[@class='data-grid-table-col']/following::tbody)[2]/tr["+i+"]";
			String headerWeb = driver.findElement(By.xpath(headerXpath)).getText();
			//headerWeb = headerWeb.replace("Column Actions", "");
			webTable = new LinkedHashMap<String, String>();
			for (int j=1; j<colEleSize+1;j++ ) {
				
				
				String detailXpath = "(//col[@class='data-grid-table-col']/following::tbody)[2]/tr["+i+"]"+"/td["+j+"]";
				
				String detailWeb = driver.findElement(By.xpath(detailXpath)).getText();
			//	webTable.put(headerWeb, detailWeb);
				System.out.println(detailWeb);
			}
			//allWebTable.add(webTable);
		//	System.out.println(allWebTable);
	
		}
		System.out.println("Finished");
	}
	
	public List<LinkedHashMap<String, String>> readExcel(String excelfileName) throws IOException {
		//excelfileName = "New_Opportunities_Report";
		//String[][] data = null;
		List<LinkedHashMap<String, String>>  allExcelTable = new ArrayList<LinkedHashMap<String, String>>();

		LinkedHashMap<String, String> excelTable = null;
		//FileInputStream fis = new FileInputStream("./data/"+excelfileName+".xlsx");
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+excelfileName+".xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
	//	data = new String[rowCount][colCount];
		
		for (int i=0; i<=rowCount; i++) {
			excelTable = new LinkedHashMap<String, String>();		
			for (int j=0; j<colCount; j++) {
				String row = sheet.getRow(i).toString();
				String cell = sheet.getRow(i).getCell(j).toString();
			//	XSSFCell cell = sheet.getRow(i).getCell(j);

				//data[i-1][j] = cell.getStringCellValue();
				excelTable.put(row, cell);


			}
			allExcelTable.add(excelTable);
			System.out.println(allExcelTable);
		}
		

		wb.close();

		return allExcelTable;
		

		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		DynamicWebtableExport webExport = new DynamicWebtableExport();
		webExport.setBrowser();
		webExport.getReportValues();
		//webExport.readExcel("New_Opportunities_Report");
	}

}
