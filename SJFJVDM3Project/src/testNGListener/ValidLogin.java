package testNGListener;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import DataDrivenFramework.Flib;

@Listeners(testNGListener.MyListener.class)
public class ValidLogin extends baseTest  {
	
@Test
	public void validLoginTC() throws IOException {
		
//		baseTest bt = new baseTest(); // Create the Object Of BaseTest c
//		bt.browserSetUp();  // To perform the pre-requistes
		
		welcomePage wb = new welcomePage(driver); // To create the Object of Welcome class
		wb.getLoginLink().click(); // To click on login link
		
		Flib flib = new Flib(); // To create the object of flib class
		String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 3); // To read data of email from excel sheet
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 4); // To read data of password from excel sheet
		
		loginPage lp = new loginPage(driver); // Create the object of LoginPage class
		lp.getEmailTB().sendKeys(email);
		lp.getPasswordTB().sendKeys(password);
		lp.getLoginButton().click();
		
		
	
		
		

	}

}
