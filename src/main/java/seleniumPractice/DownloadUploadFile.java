package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class DownloadUploadFile {

	
	public static void main (String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		Thread.sleep(3000);
		WebElement element =   driver.findElement(By.xpath("//span[text() = 'Download']"));
		element.click();
		element.sendKeys("D:\\Rough\\TestLeaf Logo.png");
		Thread.sleep(3000);
		
		File downloaded = new File("C:\\Users\\manoj\\Downloads");
				
		File[] allFiles = downloaded.listFiles();
		
		for (File file : allFiles) {
			if (file.getName().equals("TestLeaf Logo") ) {
				
				break;
				
			}

		}
		System.out.println("File is Downloaded");
		
		//driver.findElement(By.xpath("//span[@id = 'j_idt88:j_idt89_label']")).click();
		
		
	}
}
