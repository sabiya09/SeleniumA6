package Org.A7AutomationGroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SRK {

	@Test(groups= {"Bollywood","PanIndia"})
	public void Shahrukh()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Shah_Rukh_Khan");
	}
}
