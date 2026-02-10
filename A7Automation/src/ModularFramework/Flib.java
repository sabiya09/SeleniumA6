package ModularFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Org.A7Automation.testNGFramework.FrameWorkConstants;

public class Flib implements FrameWorkConstants {
	private static String EXCEL_PATH;
	/**
	 * This method accepts the key and it will fetch the value of the respective key 
	 * in the given properties file
	 * @param key [String]
	 * @param PROPERTIES_PATH 
	 * @return value [String]
	 */
	   public static String getPropertyValue(String key, String PROPERTIES_PATH) {
		   
       File file = new File(PROPERTIES_PATH);
       FileInputStream fis = null;
       try {
    	        fis = new FileInputStream(file);
       }
        catch(FileNotFoundException e)
       {
         e.printStackTrace();
       }
       Properties prop = new Properties();
       try {
    	        prop.load(fis);
       }
       catch(IOException e)
       {
    	     e.printStackTrace();
       }
        String value = prop.getProperty(key);
        return value;
       }
	   
	   /**
	    * This method accepts the sheetName , rowIndex,cellIndex to fetch a cell value
	    * from the given workbook
	    * @param sheetName[String]
	    * @param rowIndex[Index]
	    * @param cellIndex[Index]
	    * @return value[String]
	    */
	   // fetching Excel sheet data from creating method 
	   public static String getWorkbookcellValue(String sheetName,int rowIndex,int cellIndex)
	   {
		   File file = new File(EXCEL_PATH);
			FileInputStream fis =null;
			Workbook wb = null;
			try {
				fis=	new FileInputStream(file);
				wb  = WorkbookFactory.create(fis);
			}
			
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			catch(EncryptedDocumentException e)
			{
				e.printStackTrace();
			}
			String value = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
			return value; 
	   }

	   
	   public static String  getNumericCellvalueMethod(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException 
	   {
		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		 Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(rowNo);
		double data = cell.getNumericCellValue();
		
		int data1 = (int) data;
		String value = String.valueOf(data1);
		return value;
		
	   }
	   public static  int generateRandomNo()
	   {
		   Random random = new Random();
		   int rn = random.nextInt(1000,9999);
		   return rn;
	   }
}