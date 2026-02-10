package Org.Automation.handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleNestedFrame {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoqa.com/nestedframes");
		 
		 //swtching to the parent frame fram main page
		 driver.switchTo().frame("frame1");
		 String text1 = driver.findElement(By.tagName("body")).getText();
		 System.out.println(text1);
		 
		 //swtching to the child frame from parent frame
		 driver.switchTo().frame(0);
		 String text2 = driver.findElement(By.tagName("p")).getText();
		 System.out.println(text2);
		 
		 //switching child frame to parent frame
		 driver.switchTo().parentFrame();
		 String text3 = driver.findElement(By.tagName("body")).getText();
		 System.out.println(text3);
		 
		 //switching parent to main
		 driver.switchTo().defaultContent();
		 
	}
}
