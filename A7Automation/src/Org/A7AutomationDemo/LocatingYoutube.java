package Org.A7AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingYoutube {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query"))
		.sendKeys("Tarak Mehta Ka Ulta Chashma Episod 25",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Now playing']/../../..")).click();
		driver.findElement(By.xpath("//yt-formatted-string[contains(text(),\"Jetha ने की पीठ पीछे Bhide की तारीफ़ | Taa\")]"))
	    .click();	
	}
}
//(//yt-formatted-string[contains(text(),"म")]/../../../../../..//a[@id="thumbnail"])[1]
//yt-formatted-string[contains(text(),"Jetha ने की पीठ पीछे Bhide की तारीफ़ | Taa")]