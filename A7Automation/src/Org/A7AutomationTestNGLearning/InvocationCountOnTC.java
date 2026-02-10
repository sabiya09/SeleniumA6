package Org.A7AutomationTestNGLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Org.A7AutomationGenericUtilities.Flib;

public class InvocationCountOnTC {

	
	@Test(priority=2,invocationCount=4,threadPoolSize=2)
	public void LoginTC()
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
