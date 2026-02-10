package Org.A7AutomationSelectDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class UsingDeselectMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		 WebElement multiDropdown = driver.findElement(By.id("multiselect1"));
		 
		 Select select=new Select(multiDropdown);
		 
		List<WebElement> allOptions = select.getOptions();
		
		for( WebElement options:allOptions)
		{
			
			String text = options.getText();
			select.selectByVisibleText(text);
		}
		//deselecting the option byindex
		 Thread.sleep(2000);
	 select.deselectByIndex(1);
	 //deselecting the option byvalue
	 Thread.sleep(2000);
	 select.deselectByValue("volvox");
	//selecting the option byvalue
	 Thread.sleep(2000);
	 select.selectByValue("swiftx");
	 //deselecting the option deselectAll
	 Thread.sleep(2000);
	 select.deselectAll();
	 
		
	}
}
