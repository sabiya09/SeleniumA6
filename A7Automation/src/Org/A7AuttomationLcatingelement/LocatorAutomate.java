package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAutomate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.decathlon.in/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys("6766454123");
	}

}
