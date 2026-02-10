package Org.A7AutomationDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingMulatipalElementsInDemoShopWA {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise Earbusd",Keys.ENTER);
		List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()=\"Add to cart\"]"));
		System.out.println(addToCartButtons.size());
		for(WebElement x:addToCartButtons)
			x.click();
		Thread.sleep(1000);
	

	}

}
