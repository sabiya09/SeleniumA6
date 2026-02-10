package Org.A7Automation.testNGFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public static WebDriver driver;
	@BeforeClass
	public void browserSetUp()
	{
		
		String browseValue = Flib.getPrppertyValue("chrome");
		String url = Flib.getPrppertyValue("url");
		
		if(browseValue.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browseValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	@BeforeMethod
	public void login()
	{
		String email = Flib.getPrppertyValue("email");
		String password = Flib.getPrppertyValue("password");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
		
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterClass
	public void browserTearDown()
	{
		driver.quit();
	}

}
