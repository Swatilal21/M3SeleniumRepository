package readPropertiesData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ToWriteDataIntoExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("ipl");
		Row row = sheet.getRow(1);
		Cell cell = row.createCell(2);
		cell.setCellValue("pune");  // To set the value of the column
		FileOutputStream fos = new FileOutputStream("./testData/testdata.xlsx");  
		wb.write(fos);   // To write the data into excel file
	
	}

}
