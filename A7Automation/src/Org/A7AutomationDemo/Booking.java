package Org.A7AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.stayvista.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@rel=\"noreferrer\"]")).click();
	    driver.findElement(By.id("full-name")).sendKeys("raj");
	    driver.findElement(By.xpath("//label[@for=\"phone-number\"]")).sendKeys("9876543210");
	    driver.findElement(By.id("email")).sendKeys("rajp12@gmail.com");
	    driver.findElement(By.id("location")).click();
	    driver.findElement(By.xpath("//option[@value=\"lonavala\"]")).click();
	    }
	

}
