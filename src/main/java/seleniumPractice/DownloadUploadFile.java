package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DownloadUploadFile {

	
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text() = 'Download']")).click();
		Thread.sleep(3000);
		File downloaded = new File("C:\\Users\\manoj\\Downloads");
		File[] allFiles = downloaded.listFiles();
		
		for (File file : allFiles) {
			if (file.getName().equals("TestLeaf Logo") ) {

				break;
				
			}

		}
		System.out.println("File is Downloaded");
		
		driver.findElement(By.xpath("//span[@id = 'j_idt88:j_idt89_label']")).click();
		
		
	}
}
