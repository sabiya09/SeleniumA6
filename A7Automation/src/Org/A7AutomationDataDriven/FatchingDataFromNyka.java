package Org.A7AutomationDataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FatchingDataFromNyka {

	public static void main(String[] args) throws IOException {
		
		File file=new File(".\\TestData\\Nykaa.properties");
		FileInputStream fis= new FileInputStream(file);
		Properties prop=new  Properties();
		prop.load(fis);
    System.out.println(prop.getProperty("URL"));
//    System.out.println(prop.getProperty("email"));
//    System.out.println(prop.getProperty("password"));
    System.out.println(prop.getProperty("browser"));
	    
	}

}
