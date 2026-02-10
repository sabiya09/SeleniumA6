package Org.A7AutomationGroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlluArjun {

	@Test(groups= {"Tollywood","PanIndia"})
	public void Shahrukh()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
	}
}
