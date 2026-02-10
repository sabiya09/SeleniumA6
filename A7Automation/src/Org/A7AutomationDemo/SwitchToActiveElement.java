package Org.A7AutomationDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/	");
		driver.manage().window().maximize();
		
		driver.switchTo().activeElement().sendKeys("KGF2");
	}

}
