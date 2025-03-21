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

public class ToCreateRowAndEnterData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("ipl");
		Row row = sheet.createRow(10);
		Cell cell = row.createCell(0);
		cell.setCellValue("Punjab_king");
		FileOutputStream fos = new FileOutputStream("./testData/testdata.xlsx");
		wb.write(fos);
		
	}

}
