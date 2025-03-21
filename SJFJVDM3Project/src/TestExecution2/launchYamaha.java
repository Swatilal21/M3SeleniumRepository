package TestExecution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchYamaha {
  @Test(groups = "Regression")
  public void launchYamahaTC() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.yamaha-motor-india.com/");
	  Thread.sleep(3000);
	  
	  driver.close();
  
  }
}
