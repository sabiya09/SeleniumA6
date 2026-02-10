package Org.A7AutomationBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Jawa {

	@Test
	public void launching42Bobber()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bikewale.com/jawa-bikes/42-bobber/");
	Reporter.log("Launched 42 bobber",true);
	}
	
	@Test
	public void launchingPerak()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bikewale.com/jawa-bikes/perak/");
	Reporter.log("Launched Perak",true);
	}
}
