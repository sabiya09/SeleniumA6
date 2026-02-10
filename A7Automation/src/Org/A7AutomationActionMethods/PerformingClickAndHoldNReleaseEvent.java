package Org.A7AutomationActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingClickAndHoldNReleaseEvent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Acer/Downloads/DragDrop.html");
		Actions actions=new Actions(driver);
		WebElement capital = driver.findElement(By.xpath("//div[text()=\"Washington\"]"));
		WebElement country = driver.findElement(By.xpath("//div[text()=\"United States\"]"));
		//actions.moveToElement(capital).perform();
		actions.clickAndHold(capital).perform();
		Thread.sleep(2000);
		actions.release(country).perform();


	}

}
