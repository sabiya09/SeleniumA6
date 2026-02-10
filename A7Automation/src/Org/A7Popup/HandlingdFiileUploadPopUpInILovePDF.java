package Org.A7Popup;

import java.io.IOException;
import java.time.Duration;
import java.util.jar.Manifest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingdFiileUploadPopUpInILovePDF {

	public static void main(String[] args) throws IOException {
		 WebDriver driver=new  ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.ilovepdf.com/pdf_to_word");
		 driver.findElement(By.id("pickfiles")).click();
		 Runtime.getRuntime().exec("C:\\Users\\Acer\\Documents\\PdfScript.exe");
		 
	}

}
