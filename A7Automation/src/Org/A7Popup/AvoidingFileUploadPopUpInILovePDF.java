package Org.A7Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidingFileUploadPopUpInILovePDF {

   public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.findElement(By.id("pickfiles")).click();
	
	//next file to run is compiled file in documents
}
}
