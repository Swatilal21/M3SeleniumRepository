package TestNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandAssertion1 {
  @Test
  public void validLoginTC() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  String expectedWelcomePageTitle = "Demo Web Shop";
	  String expectedLoginPageTitle = "Demo Web Shop. Login";
	  Assert.assertEquals(driver.getTitle(), expectedWelcomePageTitle , "Welcome Page Is Not Found !!!");
	  
	  driver.findElement(By.linkText("Log in")).click();
	 // Assert.assertEquals(driver.getTitle(), "Login Page IS NOT Found !!!");
	  Assert.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Login Page Is Not Found !!!");
	  
	  driver.findElement(By.id("Email")).sendKeys("swatilal2104@gmail.com");
	  driver.findElement(By.id("Password")).sendKeys("Swatilal@123");
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  Thread.sleep(1000);
	  
  }
}
