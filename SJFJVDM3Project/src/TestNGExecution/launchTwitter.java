package TestNGExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchTwitter {
  @Test(groups = "Smoke")
  public void launchTwitterTC() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("http://www.twitter.com/");
	  Thread.sleep(3000);
	  
	  driver.close();
  }
  
  
}
