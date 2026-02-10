package Org.A7AutomationGroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mahesh {

	@Test(groups= {"Tollywood"})
	public void Shahrukh()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Mahesh_Babu");
	}
}
