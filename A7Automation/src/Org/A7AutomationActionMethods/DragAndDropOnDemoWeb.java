package Org.A7AutomationActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOnDemoWeb {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Acer/Downloads/DragDrop.html");
		
		//1
		WebElement draggable = driver.findElement(By.xpath("//div[text()=\"Madrid\"]"));
		WebElement droppable=driver.findElement(By.xpath("//div[text()=\"Spain\"]"));
		Thread.sleep(250);
		Actions actions=new Actions(driver);
		actions.dragAndDrop(draggable, droppable).perform();
		//2
		WebElement draggable1 = driver.findElement(By.xpath("//div[text()=\"Oslo\"]"));
		WebElement droppable1=driver.findElement(By.xpath("//div[text()=\"Norway\"]"));
		Thread.sleep(250);
		actions.dragAndDrop(draggable1, droppable1).perform();
		
		//3
		WebElement draggable2 = driver.findElement(By.xpath("//div[text()=\"Stockholm\"]"));
		WebElement droppable2=driver.findElement(By.xpath("//div[text()=\"Sweden\"]"));
		Thread.sleep(250);
		actions.dragAndDrop(draggable2, droppable2).perform();
		//4
		
		WebElement draggable3 = driver.findElement(By.xpath("//div[text()=\"Washington\"]"));
		WebElement droppable3=driver.findElement(By.xpath("//div[text()=\"United States\"]"));
		Thread.sleep(250);
		actions.dragAndDrop(draggable3, droppable3).perform();
		//5
		
		WebElement draggable4 = driver.findElement(By.xpath("//div[text()=\"Copenhagen\"]"));
		WebElement droppable4=driver.findElement(By.xpath("//div[text()=\"Denmark\"]"));
		Thread.sleep(250);
		actions.dragAndDrop(draggable4, droppable4).perform();
		
		//6
		WebElement draggable5 = driver.findElement(By.xpath("//div[text()=\"Seoul\"]"));
		WebElement droppable5 =driver.findElement(By.xpath("//div[text()=\"South Korea\"]"));
		Thread.sleep(250);
		actions.dragAndDrop(draggable5, droppable5).perform();
		
		//7
		WebElement draggable6 = driver.findElement(By.xpath("//div[text()=\"Rome\"]"));
		WebElement droppable6=driver.findElement(By.xpath("//div[text()=\"Italy\"]"));
		Thread.sleep(250);
		actions.dragAndDrop(draggable6, droppable6).perform();
		
		
	}
}
