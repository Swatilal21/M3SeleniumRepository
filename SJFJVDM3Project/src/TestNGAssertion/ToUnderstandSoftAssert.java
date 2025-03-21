package TestNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
  @Test
  public void validLoginTC() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  String expectedWelcomePageTitle = "Demo Web Shop";  // we can give title with error also still it will work and complete the login as it is soft assert
	  String expectedLoginPageTitle = "Demo Web Shop. Login";  
	 
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(), expectedWelcomePageTitle, "Welcome Page Is Not Found !!!");
	  
	  driver.findElement(By.linkText("Log in")).click();
	 sa.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Login Page Is Not Displayed !!!");
	  
	  driver.findElement(By.id("Email")).sendKeys("swatilal2104@gmail.com");
	  driver.findElement(By.id("Password")).sendKeys("Swatilal@123");
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  Thread.sleep(1000);
	  
	  sa.assertAll(); // mandatory
	  
  }
}
