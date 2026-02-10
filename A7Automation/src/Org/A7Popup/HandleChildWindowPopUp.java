package Org.A7Popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Set<String> allWindowsID = driver.getWindowHandles();
		
		String expectedChildWindow="new Window";
		
		for(String windowId:allWindowsID)
		{
			driver.switchTo().window(windowId);
			 System.out.println(driver.getTitle());
			if(driver.getTitle().equals(expectedChildWindow))
			{
				break;
			}
		}
//		

		driver.close();
		
	}

}
