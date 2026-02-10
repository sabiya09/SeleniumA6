package Org.A7AutomationTestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Org.A7AutomationGenericUtilities.Flib;

public class LoginTC {

	public static void main(String[] args) {
		String url=Flib.getPrppertyValue("url");
		String email=Flib.getPrppertyValue("email");
		String password=Flib.getPrppertyValue("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
