package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import Base.base;

public class ExtentListener implements ITestListener{
	
	ExtentTest test;

	@Override
	public void onTestFailure(ITestResult result) {
		
		test = Base.base.extent.createTest(result.getName());
		
		String screenshot = utilities.ScreenshotUtilities.takeScreenshot();
		
		test.fail("Test failed");
		
		test.addScreenCaptureFromBase64String(screenshot, result.getName());
		
		test.fail(result.getThrowable());
		
	//	base.flushReport();
		
	}

}
