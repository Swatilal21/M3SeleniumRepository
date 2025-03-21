package genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pomPackage.WelcomePage;

public class BaseTest {
protected static WebDriver driver;
	
	@BeforeClass
	//To perform pre-requisites to launch and navigate into application
	public void browserSetup() throws IOException
	{
	Flib flib = new Flib();
	String browser = flib.readPropertyData(PROP_PATH_MAINRESOURCES, "chrome");
	String url = flib.readPropertyData(PROP_PATH_MAINRESOURCES, URL);
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver = new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else
	{
		System.err.println("Enter the valid browser name");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	}
	
	@BeforeMethod
	public void validLogin() throws EncryptedDocumentException, IOException
	{	
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getLoginLink().click();
		LoginPage loginPage = new LoginPage(driver); //Creating object of LoginPage class-to access the elements located within it and perform login
		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH_MAINRESOURCES, DWSVALID , 1, 0);
		String password = flib.readExcelData(EXCEL_PATH_MAINRESOURCES, DWSVALID, 1, 1);
		loginPage.validLoginMethod(email, password);
	}
	
	@AfterMethod
	public void logOut()
	{
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.logOut();
	}
	
	@AfterClass
	//To quit the browser
	public void browserTearDown()
	{
		driver.quit();
	}
}
