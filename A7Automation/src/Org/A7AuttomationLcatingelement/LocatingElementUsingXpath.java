package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flipkart.in/");
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]//div[1]/div[1]/a/picture title/source srcset[1]")).click();
		driver.findElement(By.xpath("//input[name()='q']")).sendKeys("perfume",Keys.ENTER);
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	

}
