package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderstandAnnotations {
  @BeforeTest
  public void beforeTestMethod() {
	  Reporter.log("This is Before Test Method", true);
  }
  @AfterMethod
  public void afterTestMethod() {
	  Reporter.log("This is After Test Method", true);
  }
  @BeforeSuite
  public void beforeSuiteMethod() {
	  Reporter.log("This is Before Suite Method", true);
  }
  @AfterClass
  public void afterClassMethod() {
	  Reporter.log("This is After Class Method", true);
  }
  @BeforeClass
  public void beforeClassMethod() {
	  Reporter.log("This is Before Class Method", true);
  }
  @Test
  public void testCase1() {
	  Reporter.log("This is TestCase1 Method", true);
  }
  @Test
  public void testCase2() {
	  Reporter.log("This is TestCase2 Method", true);
  }
  @AfterSuite
  public void afterSuite() {
	  Reporter.log("This is After Suite Method", true);
  }
  @AfterTest
  public void afterTest() {
	  Reporter.log("This is After Test Method", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is Before Method", true);
  }
}
