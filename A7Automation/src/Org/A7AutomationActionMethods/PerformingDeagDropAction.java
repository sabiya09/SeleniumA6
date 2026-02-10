package Org.A7AutomationActionMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDeagDropAction {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.reliancedigital.in/");
	driver.findElement(By.xpath("//button[text()=\"No, don't.\"]")).click();
	
	driver.findElement(By.xpath("//input[contains(@placeholder,\"Search \") and @ aria-label]"))
	.sendKeys("Mobiles",Keys.ENTER);
	
	WebElement grag = driver.findElement(By.xpath("(//div[contains(@class,\"vue-slider-ndle\")]/../../..)[1]"));
	 Thread.sleep(2000);
	Actions act = new Actions(driver);
	 Thread.sleep(2000);
	act.dragAndDropBy(grag, 16, 16).pause(Duration.ofSeconds(4))
    .dragAndDropBy(grag,184, 4).perform();
	//184,4
	
}

}