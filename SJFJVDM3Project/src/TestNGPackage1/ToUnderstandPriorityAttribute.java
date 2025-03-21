package TestNGPackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandPriorityAttribute {
  @Test(priority = 2)
  public void Login() {
	  
	  Reporter.log("this is login method", true);
  }
  
  @Test(priority = 1)
  public void register() {
	  
	  Reporter.log("this is register method", true);
  }
  
  @Test(priority = 3)
  public void checkAccountBalance() {
	  Reporter.log("this is check Account Balance method", true);
	  
  }
  
  @Test (priority = 4)
  public void moneyTransfer() {
	  Reporter.log("this is money transfer method", true);
	  
  }
  
  @Test(priority = 5)
  public void Logout() {
	  Reporter.log("this is logout method", true);
	  
  }
  
  
  
  
}


