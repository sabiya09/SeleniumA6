package Org.A7AutomationTestNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnderstandingPriority {


		
		@Test(priority=-1)
		public void LaunchingKalkiFashion()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://in.kalkifashion.com/");
		
		}
		
		@Test(invocationCount=3,threadPoolSize=3)
		public void LaunchingPurpal()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.purplle.com/");
		}
		
	
		@Test(priority=2,enabled=true)
		public void LaunchingFullyFilmi()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://fullyfilmy.in/");
		}
		

}
