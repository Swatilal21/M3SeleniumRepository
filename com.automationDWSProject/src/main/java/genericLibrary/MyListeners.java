package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class MyListeners extends BaseTest implements ITestListener {
	 
        @Override
		public void onTestStart(ITestResult result) {
			Reporter.log("--Test started --" + result.getName(), true);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			Reporter.log("--Test successed --" + result.getName(), true);
		}

		@Override
		public void onTestFailure(ITestResult result)  //result variable- will get method name input from class- where MyListeners class is used as Listener
		{   
			 String failedMethodName = result.getName();   //getName()- will give name of method(test case) which is getting failed
			 
			 LocalDateTime ldt = LocalDateTime.now();
			 String timeStamp = ldt.toString().replaceAll(":", "-");
			 
			 TakesScreenshot ts = (TakesScreenshot) driver;
			 File source= ts.getScreenshotAs(OutputType.FILE);
			 File destination = new File("./errorshots/" + failedMethodName + timeStamp + ".png");
			 try {
				Files.copy(source, destination);   //use Files class from com.google.common.io.files or use FileHandler class 
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			 
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			Reporter.log("--Test skipped --" + result.getName(), true);
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			Reporter.log("--Test failed but within success percentage --" + result.getName(), true);
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			Reporter.log("--Test failed but with timeout --" + result.getName(), true);
		}

		@Override
		public void onStart(ITestContext context) {
			Reporter.log("<test>--" + context.getName() + "started", true);
		}

		@Override
		public void onFinish(ITestContext context) {
			Reporter.log("<test>--" + context.getName() + "finished", true);
		}
		
	}

}
