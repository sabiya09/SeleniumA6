package Org.A7Popup;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingDynamicXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		LocalDateTime idt=LocalDateTime.now();
		int date=idt.getDayOfMonth();
		String monthtemp=idt.getMonth().toString();
		String month=monthtemp.charAt(0)+monthtemp.substring(1).toLowerCase();
		System.out.print(("//div[text()='"+month+"']/../..//span[text()='"+date+"']"));
				
	}
}
