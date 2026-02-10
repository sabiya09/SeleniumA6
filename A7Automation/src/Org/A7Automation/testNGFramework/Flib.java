package Org.A7Automation.testNGFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Org.A7AutomationGenericUtilities.FrameWorkConstants;
/**
 * The class is mainly used to interact with the file and fetch the test data needed for automating Application.
 * @author Sabiya
 * @param key
 * @return
 */
public class Flib  {
	
	/** 
	 * This method accepts the key and  it will fetch the value  of the respective key 
	 * in the given properties file
	 */

	public static String getPrppertyValue (String key) 
	{
		
		
		File file=new File(FrameWorkConstants.PROPERTIES_PATH);
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			
		
		prop.load(fis);
		}
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
		String value=prop.getProperty(key);
		return value;
	
		
		
	}
/**
 * This method is accepts the key and it will fetch the value form excel file
 * @param string 
 * @param sheetName[String]
 * @param rowIndex[Int]
 * @param CellIndex[Int]
 * @return
 */
	public static String getworkbookCellValue(String sheetName, int rowIndex,int CellIndex)
	{
		File file=new File( FrameWorkConstants.EXCEL_PATH);
		FileInputStream fis=null;
		Workbook wb=null;
		try {
		fis=new FileInputStream(file);
		wb=WorkbookFactory.create(fis);
		}
		catch(FileNotFoundException E)
		{
			E.printStackTrace();
		}
		catch(EncryptedDocumentException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		String value=wb.getSheet(sheetName).getRow(rowIndex).getCell(CellIndex).toString();
		return value;
	}
public static String getworkbookCellValue(String excelPathTest, String string, int i, int j) {
	// TODO Auto-generated method stub
	return null;
}

}
