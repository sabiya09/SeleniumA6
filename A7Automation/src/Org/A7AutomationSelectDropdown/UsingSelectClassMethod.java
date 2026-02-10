package Org.A7AutomationSelectDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClassMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/reg");
	
	 WebElement dateDropdown = driver.findElement(By.id("day"));
	
	 Select select=new Select(dateDropdown);
	 
	 // to check the date  drop down is single select or  multiple  select
	 if(select.isMultiple())
		 System.out.println("Multi - select dropdown");
	 else
		 System.out.println("single - select dropdown");
	 
	 //fetching all the options from the date drop down
	 List<WebElement> allOptions = select.getOptions();
	 
	//selecting all the options 1 by 1 using for loop
	 for(int index=0 ;index <allOptions.size();index++)
	 {
		 Thread.sleep(250);
		 select.selectByIndex(index);
	 }
	 }

}


