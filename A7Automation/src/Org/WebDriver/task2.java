package Org.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) throws InterruptedException {
		String expextedResult = "https://suzuki.com/";
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.yamaha.com/en/");
	String windowID = driver.getWindowHandle();
	System.out.println(windowID);
	Thread.sleep(2000);
	
	driver.get("https://suzuki.com/");
	String windowID2 = driver.getWindowHandle();
	System.out.println(windowID2);
	Thread.sleep(2000);
	
	driver.get("https://www.zomato.com/");
	String windowID3 = driver.getWindowHandle();
	System.out.println(windowID3);
	
	if(expextedResult.equalsIgnoreCase(windowID))
	{
		//driver.close();
	}
	else
	{
		driver.close();
	}
	
		
	}
}


