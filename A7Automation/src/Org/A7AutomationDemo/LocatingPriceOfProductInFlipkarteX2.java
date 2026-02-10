package Org.A7AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class LocatingPriceOfProductInFlipkarteX2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("best phone under 5000",Keys.ENTER);
		WebElement  elementPrice =driver.findElement(By.xpath("(//div[contains(text(),\"I Kall I1 \")"
				+ " and contains(text(),'Golden')]/../..//div[contains(text(),'₹')])[1]"));
		String price = elementPrice.getText();
		System.out.println("price :"+price);

	}

}
