package Org.A7AutomationDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		
		//get title method
		String title= driver.getTitle();
		System.out.println(title);
		
		//get current url method
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		//getgetPageSource()
		String sourceCode= driver.getPageSource();
		System.out.println(sourceCode);
		
		//getWindowHandle()
		String windowId= driver.getWindowHandle();
		System.out.println(windowId);
		
	}

}
