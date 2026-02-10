package Org.A7AuttomationLcatingelement;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingLoginButtonUsingCssSelectorLocator {

		public static void main(String[] args) {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			//driver.get("https://www.amazon.in/");
			driver.findElement(By.name("q")).sendKeys("perfume",Keys.ENTER);
			driver.findElement(By.cssSelector("img[alt='BELLAVITA White Oud ,Long Lasting,Unisex Eau de Parfum  -  100 ml']")).click();
			driver.findElement(By.cssSelector("button[class='QqFHMw cNEU5Q J9Kkbj _7Pd1Fp']")).click();
		//	driver.findElement(By.id("add-to-cart-button")).click();
			//driver.findElement(By.name("submit.add-to-cart")).click();
		}
	}
