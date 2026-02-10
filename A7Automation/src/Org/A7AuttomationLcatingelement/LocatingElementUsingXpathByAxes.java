package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpathByAxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Acer/Downloads/XpathAxes.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='Vertebrate']/parent::div[@class='Animal']"));
		//mammal to other ===//div[@class='Mammal']/parent::div[@class='Vertebrate']//div[@class='Other']
		//
	}
}
