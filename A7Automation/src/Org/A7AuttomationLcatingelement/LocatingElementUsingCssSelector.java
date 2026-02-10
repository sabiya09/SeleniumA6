package Org.A7AuttomationLcatingelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingCssSelector {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.alibaba.com/");
	
	driver.findElement(By.cssSelector("input[class='header-tab-shade-input-item header-tab-input-text']")).sendKeys("watch",Keys.ENTER);
    driver.findElement(By.cssSelector("img[src='https://s.alicdn.com/@sc04/kf/H966992dc0dfa4471bf65ae60c4e125a5j.jpg_300x300.jpg']")).click();
}
}
