package Org.A7AutomationSelectDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToFeatchelementntAndUnselectOptionsList {

	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Acer/Downloads/Bikes.html");
		 WebElement dropdown = driver.findElement(By.id("Bikes"));
		 
		 Select select=new Select(dropdown);
		 
		 List<WebElement> allOptions = select.getOptions();
		 
		 for(WebElement option:allOptions)
		 {
			System.out.println( option.getText());
			 
		 }
		   List<WebElement> selectedOptions = select.getAllSelectedOptions();
		   System.out.println();
		   System.out.println("===== Selected options =====");
		   
		   for(WebElement option:selectedOptions)
		   {
			   System.out.println(option.getText());
		   }
		   System.out.println();
			
			//fetching first selected option
			System.out.print("First Selected Option : ");
			System.out.println(select.getFirstSelectedOption().getText());
	}
}
