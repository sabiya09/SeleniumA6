package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationInDWST {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("abc");
		 driver.findElement(By.id("LastName")).sendKeys("ABC");
		 driver.findElement(By.id("Email")).sendKeys("abcABC@gamil.com");
		 driver.findElement(By.id("Password")).sendKeys("abcd@#23");
		 driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd@#23");
		 driver.findElement(By.id("register-button")).click();
		 
	}
}
