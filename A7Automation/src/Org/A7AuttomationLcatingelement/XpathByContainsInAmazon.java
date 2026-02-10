package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathByContainsInAmazon {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes fro men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(by.)
	}
}
