package Org.A7AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddToCart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()=\"Continue shopping\"]")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone17");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[contains(text(),\"iPhone 17 Pro\")]/../../../..//button[text()=\"Add to cart\"])[2]"))
		.click();
		WebElement price = driver.findElement(By.xpath("(//span[text()=\"iPhone 17 Pro 256 GB: 15.93 cm (6.3″) Display with Promotion up to 120Hz, A19 Pro Chip, Breakthrough Battery Life, Pro Fusion Camera System with Center "
				+ "Stage Front Camera; Cosmic Orange\"]/../../../..//span[text()=\"₹\"])[1]"));
		System.out.println(price);
		
	}

}//span[text()="₹"]
