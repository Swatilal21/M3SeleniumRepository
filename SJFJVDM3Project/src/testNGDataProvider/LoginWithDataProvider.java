package testNGDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginWithDataProvider {
	@DataProvider(name = "logincreds")
	public String[][] dataProviderMethod()
	{
	String[][] data = {
			            {"admin123@gmail.com" , "manager@123"},
			            {"a d m i n@yahoo.com" , "test123#"},
			            {"qwerty123@gmail.com" , "ytrewq456$"}
	                 };
	return data;
	
	}
 
  @Test(dataProvider = "logincreds", dataProviderClass = testNGDataProvider.LoginWithDataProvider.class)
  public void invalidLoginTC(String email, String password) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys(email);
	  driver.findElement(By.id("Password")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  Thread.sleep(1000);
	  
  }
}
