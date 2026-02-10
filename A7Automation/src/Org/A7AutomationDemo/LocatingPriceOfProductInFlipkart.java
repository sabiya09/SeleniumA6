package Org.A7AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOfProductInFlipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("phone",Keys.ENTER);
		WebElement priceElement=driver.findElement(By.xpath("(//img[@alt='Samsung Galaxy F36 5G (Red, 128 GB)']/../../../../..//div[contains(text(),\"₹\")])[1]")) ; 
		 String price= priceElement.getText();
		 System.out.println("price :"+price);//
		}

}
