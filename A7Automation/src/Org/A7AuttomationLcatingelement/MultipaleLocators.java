package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipaleLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//ID LOCATOR EXAMPLE
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("abc@35");
		
		//CLASS LOCATOR EXAMPLE
		//driver.findElement(By.name("pass")).sendKeys("hjsds");
		
		//CSS selector for any attribute
		driver.get("https://www.shopsy.in/");
		driver.findElement(By.cssSelector("img[alt='Image Placeholder']")).click();
	}
}
