package Org.A7AutomationSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectionMethodInOmayo {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	 WebElement dropdownElement = driver.findElement(By.id("drop1"));
	 Select select= new Select(dropdownElement);
	 //selecting an option based on select locator 
	 select.selectByVisibleText("doc 1");
	 Thread.sleep(2000);
	 select.selectByValue("ghi");
	 Thread.sleep(2000);
	 select.deselectByIndex(4);
	 Thread.sleep(2000);
}

}
