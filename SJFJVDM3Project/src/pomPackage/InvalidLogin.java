package pomPackage;

import java.io.IOException;

import DataDrivenFramework.Flib;

public class InvalidLogin extends baseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		baseTest bt = new baseTest();
		bt.browserSetUp();
		
		welcomePage wp = new welcomePage(driver);
		wp.getLoginLink().click();
		
		Flib flib = new Flib();
		 int rc = flib.lastRowCount(EXCEL_PATH, INVALIDLOGINCREDS);
		 
		 loginPage lp = new loginPage(driver);
		 
		 for(int i = 1; i<+rc; i++) {
			 String email = flib.readExcelData(EXCEL_PATH, INVALIDLOGINCREDS, i, 0);
			String password = flib.readExcelData(EXCEL_PATH, INVALIDLOGINCREDS, i, 1);
			 
			 lp.invalidLogin(email,password);
		 }

	}
	

}
