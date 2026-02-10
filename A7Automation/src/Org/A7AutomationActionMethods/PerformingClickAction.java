package Org.A7AutomationActionMethods;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingClickAction {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		 WebElement button = driver.findElement(By.xpath("//button[text()=\"No, don't.\"]"));
		//button.click();
		Actions actions =new Actions(driver);
		actions.moveToElement(button).click();
	}

}
