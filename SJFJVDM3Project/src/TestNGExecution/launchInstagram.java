package TestNGExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchInstagram {
  @Test(groups = "Integration")
  public void launchInstagramTC() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.instagram.com/");
	  Thread.sleep(3000);
	  
	  driver.close();
  }
}
