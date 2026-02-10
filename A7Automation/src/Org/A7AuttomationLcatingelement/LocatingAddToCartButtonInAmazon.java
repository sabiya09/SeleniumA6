package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAddToCartButtonInAmazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise Earbuds");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath
		("//span[contains(text(),'Noise Buds VS104 T')]/../../../..//button[@name=\"submit.addToCart\"]"))
		.click();
		
	}

}
