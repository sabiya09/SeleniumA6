package Org.A7AutomationSelectDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClassMethodByValue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
	    Select select=new Select(yearDropdown);
	    
	    List<WebElement> allOption = select.getOptions();
	    for( WebElement option:allOption)
	    {
	      String value = option.getAttribute("value");
	      select.selectByValue(value);
	    }
	}
}
