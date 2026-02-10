package Org.A7AutomationDemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnSizeOfWindow {

	
	 public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        // Set window size (same for all)
	        Dimension windowSize = new Dimension(0, 800);

	        // ----- Window 1 -----
	        driver.get("https://www.google.com");
	        driver.manage().window().setSize(windowSize);
	        driver.manage().window().setPosition(new Point(0, 10));

	        // ----- Window 2 -----
	        WebDriver window2 = driver.switchTo().newWindow(WindowType.WINDOW);
	        window2.get("https://www.wikipedia.org");
	        window2.manage().window().setSize(windowSize);
	        window2.manage().window().setPosition(new Point(500, 0));  // next to window 1

	        // ----- Window 3 -----
	        WebDriver window3 = driver.switchTo().newWindow(WindowType.WINDOW);
	        window3.get("https://www.github.com");
	        window3.manage().window().setSize(windowSize);
	        window3.manage().window().setPosition(new Point(1000, 0));  // next to window 2
	    }
	}
