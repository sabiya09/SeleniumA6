package Org.A7AutomationDataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FatchingDataFromProperties {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Acer\\eclipse-workspace\\A7Automation\\TestData\\DWS.properties");
		FileInputStream fis= new FileInputStream(file);
	    Properties prop = new Properties();
	    prop.load(fis);
	    System.out.println(prop.getProperty("URL" ));
	    System.out.println(prop.getProperty("Email"));
	    System.out.println(prop.getProperty("password"));
	    System.out.println(prop.getProperty("Browser" ));
	    
	}
}