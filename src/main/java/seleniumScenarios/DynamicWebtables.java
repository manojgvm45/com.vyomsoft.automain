package seleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicWebtables {
	
	
	public WebDriver driver;
	public void setBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("spain");
		Thread.sleep(3000);
		
		
	}
	
	
	//From web table -to get whose from selected country
	public void dynamicTable1() {
			 String country ="spain";
	
/*
		List<WebElement> allRows = driver.findElements(By.xpath("//span[text()='Country']/parent::td"))	;
		int row_size_country = allRows.size();
		System.out.println(row_size_country);
		for (WebElement indRowElement : allRows) {
			String cellValue = indRowElement.getText();
			System.out.println("cellValuefound : "  + cellValue);
			if (cellValue.equalsIgnoreCase("india")) {
				
				System.out.println("india results : "  + cellValue);

			}
		}
		*/
		//Take Column length of the needed header 
		List<WebElement> allCols = driver.findElements(By.xpath("//span[text()='Country']/parent::td"))	;
		int allColLength = allCols.size();
		//for (int i=3; i<allRowLength+1 ; i++) {
			//String xpathStr = "("+"//span[text()='Name']/ancestor::tr"+")["+i+"]";
			//String getAllrowValues = driver.findElement(By.xpath(xpathStr)).getText();
			//System.out.println(xpathStr);
			for (int j=1;j<allColLength+1;j++) {
				String xpathStr1 = "("+"//span[text()='Country']/parent::td"+")["+j+"]";
				//System.out.println(xpathStr1);
				String getCountry = driver.findElement(By.xpath(xpathStr1)).getText();
				//System.out.println(getCountry);
					if(getCountry.equalsIgnoreCase(country)) {
						String xpathStr3 = "("+"//span[text()='Name']/parent::td"+")["+j+"]";
						String getName = driver.findElement(By.xpath(xpathStr3)).getText();
						System.out.println(getCountry + " people are: "+getName);
						//to find count of members
						//List<WebElement> membersCount = driver.findElements(By.xpath("//span[text()='Name']/parent::td"));
						//int count = membersCount.size();
						//System.out.println(getCountry + " count of people are: "+ count);
						
						
					}
		
				
			}
			

	//	}
			
			
		

	}
	public static void main(String[] args) throws InterruptedException {
		
		DynamicWebtables web = new DynamicWebtables();
		web.setBrowser();
		web.dynamicTable1();

	}

}
