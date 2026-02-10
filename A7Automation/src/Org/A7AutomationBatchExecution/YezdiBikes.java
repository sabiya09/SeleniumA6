package Org.A7AutomationBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class YezdiBikes {


	@Test
	public void launchingYezdiBikes()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bikewale.com/yezdi-bikes/roadster/");
	Reporter.log("launching YezdiBikes",true);
	}
}
