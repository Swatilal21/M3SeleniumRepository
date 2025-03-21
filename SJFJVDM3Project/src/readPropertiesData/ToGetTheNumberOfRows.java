package readPropertiesData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToGetTheNumberOfRows {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx"); // TO specify the path of the file
		Workbook wb = WorkbookFactory.create(fis);  //to make the file ready to read
		Sheet sheet = wb.getSheet("ipl");  // To get into desired sheet
		int rc = sheet.getLastRowNum();  // To count the number of rows
		System.out.println(rc);

	}

}
