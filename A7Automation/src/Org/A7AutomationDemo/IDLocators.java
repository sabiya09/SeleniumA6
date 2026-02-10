package Org.A7AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Abc");
		driver.findElement(By.id("pass")).sendKeys("abc@hgjd.com");
		driver.findElement(By.name("login")).click();
	}

}
