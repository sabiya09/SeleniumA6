package Org.A7Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDisableNotificationPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveByOffset(442, 191).click().perform();
		//act.moveToElement(act).click();
		

	}

}
