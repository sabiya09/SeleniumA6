package Org.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) throws InterruptedException {
		String expextedResult = "https://suzuki.com/";
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.yamaha.com/en/");
	String windowID = driver.getWindowHandle();
	System.out.println(windowID);
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://suzuki.com/");
	String windowID2 = driver.getWindowHandle();
	System.out.println(windowID2);
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.zomato.com/");
	String windowID3 = driver.getWindowHandle();
	System.out.println(windowID3);
	driver.switchTo().newWindow(WindowType.TAB);
	
	if(expextedResult.equalsIgnoreCase(windowID2))
	{
		driver.close();
	}
	
	}
		
	}

