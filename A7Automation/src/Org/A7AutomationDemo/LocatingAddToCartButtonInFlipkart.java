package Org.A7AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAddToCartButtonInFlipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.in/");
		driver.findElement(By.name("q")).sendKeys("iphone 17",Keys.ENTER);
		driver.findElement(By.linkText("Apple iPhone 17 Pro Max (Deep Blue, 256 GB)")).click();
		driver.findElement(By.xpath("//div[contains(text(),' iPhone 17 Pro Max (Silver, 256 GB)')]")).click();
	}

}
