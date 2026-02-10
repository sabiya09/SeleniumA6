package Org.A7AutomationDemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindow {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Acer/Downloads/Assign.html");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		 String parentWindowId=driver.getWindowHandle();
	    String expectedURL= "https://www.swiggy.com/";
	   Set<String> AllwindowIds=driver.getWindowHandles();
	   AllwindowIds.remove(parentWindowId);
		   for(String windowId: AllwindowIds )
		   {
			   driver.switchTo().window(windowId);
			   String ActualURL= driver.getCurrentUrl();
			
			   if(expectedURL.equalsIgnoreCase( ActualURL))
			   {
				   driver.manage().window().maximize();
				   Thread.sleep(2000);
				   driver.close();
				   break;
			   }
		   }
	}

}
