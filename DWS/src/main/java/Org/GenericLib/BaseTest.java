package Org.GenericLib;

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

import Org.POMRepository.BasePage;
import Org.POMRepository.LoginPage;


public class BaseTest implements FrameWorkConstants {
	
	 public static WebDriver driver;
     @BeforeClass
     public void browserSetUp() 
     {
   	String browserValue = Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"chrome");
   	String url = Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"url");
   	
   	if(browserValue.equalsIgnoreCase("chrome")) {
   		driver=new ChromeDriver();
   	}
   	
   	else if(browserValue.equalsIgnoreCase("firefox")) {
   		driver=new FirefoxDriver();
   	}
   	
   	else {
   		driver=new EdgeDriver();
   	}
   	  
   	  driver.manage().window().maximize();
   	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 	  driver.get(url);
     }
     @BeforeMethod
      public void login()
      {
   	  String email = Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"email");
   	  String password = Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"password");
   	   driver.findElement(By.xpath("//span[@class=\"close\"]"));
   	  
   	  BasePage bp = new BasePage(driver);
   	  bp.getLoginLink().click();
   	  
   	  LoginPage lp = new LoginPage(driver);
   	  lp.getEmailTB().sendKeys(email);
   	  lp.getPasswordTB().sendKeys(password);
   	  lp.getLoginButton().click();
   	  
      }
     
     @AfterMethod
     public void logout()
     {
      	BasePage  bp=  new BasePage(driver);
     	bp.getLoginLink().click();
   	    
     }
     @AfterClass
     public void browserTearDowm() 
     {
   	   driver.quit();
     }
}
