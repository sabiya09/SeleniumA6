package Org.A7Automation.testNGFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Org.A7Automation.testNGFramework.MyListener.class)
public class TC_001_AddToCartTest extends BaseTest {
    @Test
	public void addToCart()
	{
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		driver.findElement(By.xpath("//img[@alt=\"Picture for category Cell phones\"]")).click();
		//driver.findElement(By.xpath("//a[text()=\"Smartphone\"]/../../..//input[@value=\"Add to cart\"]")).click();
		WebElement productAddToCart = driver.findElement(By.xpath("//p[text()=\"The product has been added to your \"]"));
	
		 if(productAddToCart.isDisplayed())
		 {
			 Reporter.log("The product has been added to Cart",true);
		 }
		 else
		 {
			 Reporter.log("The product has been not added to Cart",true);

		 }
		 driver.findElement(By.xpath("//span[@class=\"close\"]")).click();
	}

}
