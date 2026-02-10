package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingFileElementUsingLogicalOrOperator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Acer/Downloads/XpathLogicalAnd.html");
		WebElement textbox;
		//Locating first name
		textbox=driver.findElement(By.xpath("//input[@id='f-name' or  name='first']"));
		textbox.clear();
		textbox.sendKeys("Sabiya");
		
		//locating last name
		textbox=driver.findElement(By.xpath("//input[@id=\"l-name\" or @name=\"last\"]"));
		textbox.clear();//clear the placeholder name
		textbox.sendKeys("Mulani");
		
		 //locating gender button
		driver.findElement(By.xpath("//input[@value='F' and  @name='gender']")).click();
		
		
	
	}

	
}
