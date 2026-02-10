package Org.A7AutomationTestNGLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Org.A7AutomationGenericUtilities.Flib;

public class PriorityOnTC {
   
	
	
	@Test
	public void registor()
	{
		String url=Flib.getPrppertyValue("url");
		String sheetName="Registration";
		String gender=Flib.getworkbookCellValue(sheetName, 2, 0);
		String firstName=Flib.getworkbookCellValue(sheetName, 2, 1);
		String lastName=Flib.getworkbookCellValue(sheetName, 2, 2);
		String email=Flib.getworkbookCellValue(sheetName, 2, 3);
		String password=Flib.getworkbookCellValue(sheetName, 2, 4);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		if(gender.equalsIgnoreCase("male"))
		{
			driver.findElement(By.id("gender-male")).click();;
		}
		else {
			driver.findElement(By.id("gender-female")).click();;
		}
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
        driver.findElement(By.id("register-button")).click();
		
	}
	@Test(priority=1)
	public void Login()
	{
		String url=Flib.getPrppertyValue("url");
		String sheetName="Registration";
		String email=Flib.getworkbookCellValue(sheetName, 2, 3);
		String password=Flib.getworkbookCellValue(sheetName, 2, 4);
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
