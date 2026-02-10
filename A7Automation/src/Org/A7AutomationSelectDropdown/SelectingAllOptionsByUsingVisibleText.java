package Org.A7AutomationSelectDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingAllOptionsByUsingVisibleText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		
		 WebElement monthDropdown = driver.findElement(By.id("month"));
		 
		 Select select=new Select(monthDropdown);
		 
		 
		 //fetching element from  month drop down
		 
		 List<WebElement> allOptions = select.getOptions();
		 
		 //fetching element using for each loop
		 for(WebElement options:allOptions)
		 {
			 Thread.sleep(250);
			 String text = options.getText();
			 select.selectByVisibleText(text);
		 }
		 
}
}