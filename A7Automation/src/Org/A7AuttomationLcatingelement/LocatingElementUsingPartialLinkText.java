package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingPartialLinkText{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotorcycle.co.in/");
		driver.findElement(By.partialLinkText("ACCESSORIES")).click();
			
	}

}
