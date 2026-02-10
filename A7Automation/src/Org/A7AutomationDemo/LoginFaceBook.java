package Org.A7AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFaceBook {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("sabiya");
	    driver.findElement(By.id("pass")).sendKeys("sabiya@123");
	    driver.findElement(By.name("login")).click();
		
	}

}
