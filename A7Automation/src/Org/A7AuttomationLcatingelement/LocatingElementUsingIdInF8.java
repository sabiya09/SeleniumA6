package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingIdInF8 {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox =driver.findElement(By.id("email"));
		emailTextBox.sendKeys("sabiya");
		Thread.sleep(2000);
		emailTextBox.sendKeys("@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sabiya@123");
		driver.findElement(By.name("login")).click();
	}

}
