package Org.Automation.handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnFrameInDream11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/fantasy-sports");
		
		//1.using frame(int index)
		//driver.switchTo().frame(0);
		//2.frame(String nameorId)
		//driver.switchTo().frame("send-sms-iframe");
		//3.frame(WebElement frameElement)
	   WebElement frameElement = driver.findElement(By.id("send-sms-iframe"));
	   driver.switchTo().frame(frameElement);
	   
		driver.findElement(By.id("regEmail")).sendKeys("7517524141");
		driver.findElement(By.id("regUser")).click();
		
		//4 default content();
		//used to bring the control back to main page or default  content
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Industry Overview")).click();
		
		
	}
}
