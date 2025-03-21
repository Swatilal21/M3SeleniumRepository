package TestExecution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchBMW {
  @Test(groups = "Functional")
  public void launchBMWTC() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.bmw.in/en/index.html");
	  Thread.sleep(3000);
	  
	  driver.close();
 }
}
