package Org.A7AutomationDataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file=new File("./TestData/DWS.XLSX");
		FileInputStream  fis =new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Registration");
		 Row row = sheet.getRow(1);
		Cell cell = row.getCell(3);
		System.out.println(cell.toString());
		
		
		String password = sheet.getRow(1).getCell(2).toString();
		System.out.println(password);
		
		
	}

}
