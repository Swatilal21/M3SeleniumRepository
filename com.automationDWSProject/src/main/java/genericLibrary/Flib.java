package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//To fetch/read the data from Excel file
		public String readExcelData(String excelPath, String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			 Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			String data = cell.toString();
			return data;
		}
		
		//To fetch/read the data from Property file
		public String readPropertyData(String proPath, String key) throws IOException
		{
			FileInputStream fis = new FileInputStream(proPath);
			Properties prop = new Properties();
			prop.load(fis);
			String data = prop.getProperty(key);
			return data;
		}
		
		//To count the rows in the excel sheet
		public int lastRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			int rowCount = sheet.getLastRowNum();
			return rowCount;
		}
		
		//To get the random input, so we can concatenate it with required fields ex. phonenumber
		public int randomNumber()
		{	
			Random random = new Random();
			int randomNumber = random.nextInt(1000, 9999);
			return randomNumber;	
		}
		
		//To get data from excel to use random input
		public long readExcelData1(String excelPath, String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			long data = (long) cell.getNumericCellValue();
			return data;
		}
	

}
