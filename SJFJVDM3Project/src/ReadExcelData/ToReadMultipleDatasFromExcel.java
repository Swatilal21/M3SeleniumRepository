package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDatasFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		for(int i=1; i<=9; i++)
		{
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
		
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("ipl");
	    Row row = sheet.getRow(i);
	    Cell cell = row.getCell(0);
	    String data = cell.getStringCellValue();
	    System.out.println(data);
	    Thread.sleep(1000);
	    
	
		
	    
	}

}
}