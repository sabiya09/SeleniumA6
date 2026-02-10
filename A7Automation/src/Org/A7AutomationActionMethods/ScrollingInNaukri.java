package Org.A7AutomationActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingInNaukri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement scroll = driver.findElement(By.xpath("//span[text()=\"Resume writing\"]"));
		Actions actions=new Actions(driver);
		actions.scrollToElement(scroll).scrollByAmount(0, 250).perform();
		Thread.sleep(2000);//to see the the scroll method is crolling till the given element or not
		scroll.click();
		
	}

}
