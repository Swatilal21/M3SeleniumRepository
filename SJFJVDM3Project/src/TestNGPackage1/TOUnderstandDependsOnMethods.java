package TestNGPackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TOUnderstandDependsOnMethods {
  @Test(dependsOnMethods = "register")
  public void login() {
	  Reporter.log("This is Login Method", true);
  }
  
  @Test
  public void register() {
	  int a = 1;
	  int b = 0;
	  System.out.println(a/b);
	  Reporter.log("This is register Method", true);
  }
  
  @Test(dependsOnMethods = "login")
  public void checkAccountBalance() {
	  Reporter.log("This is check account balance Method", true);
  }
  
  @Test(dependsOnMethods = {"register","login"})
  public void moneyTransfer() {
	  Reporter.log("This is check account balance Method", true);
  }
  
  @Test(dependsOnMethods = {"login","moneyTransfer"})
  public void logout() {
	  Reporter.log("This is Logout Method", true);
  }
}
