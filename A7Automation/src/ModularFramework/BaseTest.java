package ModularFramework;

import java.time.Duration;

import Org.A7AutomationGenericUtilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public static WebDriver driver;
	@BeforeClass
	public void browserSetup() {
		
	   String browserName = Flib.getPrppertyValue("Chrome");
	   String url = Flib.getPrppertyValue("URL");
	
	   if(browserName.equalsIgnoreCase("chrome"))
	   {
		   driver=new ChromeDriver();	 
	   }
	   else if(browserName.equalsIgnoreCase("firefox"))
	   {
		   driver=new FirefoxDriver();	 
	   }
	   else if(browserName.equalsIgnoreCase("edge"))
	   {
		   driver=new EdgeDriver();	 
	   }
	   else
	   {
		   System.out.println("enter correct browsername");
	   }
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(15));
	   driver.get(url);
	   
	}
	@BeforeMethod
	public void Login()
	{
		String Email=Flib.getPrppertyValue("Email");
		String Password=Flib.getPrppertyValue("Password");
		
		BasePage bp=new BasePage(driver);
		bp.getLoginLink().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTB().sendKeys(Email);
		lp.getPasswordTB().sendKeys(Password);
		lp.getLoginButton().click();
		
	}
	
	@AfterMethod
	public void Logout()
	{
		BasePage bp=new BasePage(driver);
		bp.getLogOutLink().click();
		
		
	}
	
	@AfterClass
	public void browserTearDown()
	{
	driver.quit();
	}

}
