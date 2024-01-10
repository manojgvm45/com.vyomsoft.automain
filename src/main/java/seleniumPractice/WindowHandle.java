package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node017h5fifr8nu6yhf36efadmvi661423.node0");
		Thread.sleep(3000);
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window : " + parentWindow);
		driver.findElement(By.xpath("//*[text()='Click and Confirm new Window Opens']/following::button[1]")).click();
		Set<String> allWindows =driver.getWindowHandles();
		System.out.println("all Window : " + allWindows);
		for (String newWindow : allWindows) {
			if(!newWindow.equals(parentWindow)) {
			driver.switchTo().window(newWindow);
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@placeholder='Search...']")).sendKeys("manj");
			//driver.close();
			}
					}
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Home']")).click();
	//	driver.close();
		//driver.switchTo().defaultContent();
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		//openMultiple Windows
				driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
				Set<String> multiWindows = driver.getWindowHandles();
				int windowSize = multiWindows.size();
				System.out.println(windowSize);
				for (String closeWindows : multiWindows) {
					//driver.switchTo().window(closeWindows);
					if(!closeWindows.equals(parentWindow)) {
						driver.switchTo().window(closeWindows);
						driver.close();
					}
				}
				
				
				
	}

}
