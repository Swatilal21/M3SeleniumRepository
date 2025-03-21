package readPropertiesData;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginInDWS implements IAutoConstant{
	public static void main(String[] args) throws IOException {
		flib flib = new flib();
	String url = flib.readDataFromPropertyFile(PROP_PATH,"url");
	String email = flib.readDataFromPropertyFile(PROP_PATH, "email");
    String pass = flib.readDataFromPropertyFile(PROP_PATH, "password");
    
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get(url);
    
    driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.id("Email")).sendKeys(email);
    driver.findElement(By.id("Password")).sendKeys(pass);
    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
