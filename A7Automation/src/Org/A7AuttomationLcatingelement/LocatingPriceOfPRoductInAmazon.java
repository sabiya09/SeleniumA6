package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LocatingPriceOfPRoductInAmazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise Earbusd",Keys.ENTER);
		WebElement priceElement = driver.findElement(By.xpath(
				"//span[contains(text(),'Noise Master ')]/../../../.."
				+ "//span[@class=\'a-price-whole\']"));
        String price= priceElement.getText();
        System.out.println("Price : "+price);
	}
}
