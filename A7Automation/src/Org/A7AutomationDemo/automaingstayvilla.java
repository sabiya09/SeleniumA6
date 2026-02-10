package Org.A7AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automaingstayvilla 
{
	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://www.stayvista.com/partner-with-us");
    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Raj");
    driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("patil");
    driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("rajpatil12@gmail.com");
    driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("9876543210");
    driver.findElement(By.id("locations")).sendKeys("Agra");
    driver.findElement(By.xpath("(//div[@role='combobox'])[2]")).sendKeys("Villa");
   // driver.findElement(By.xpath("(//span[@class=\"MuiTouchRipple-root css-w0pj6f\"])[3]")).click();

	}
	

}
