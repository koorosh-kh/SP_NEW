package Com.Verizon.Verizon_Home;


import java.io.IOException;

import org.openqa.selenium.remote.ScreenshotException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import CommonVer.BrowserVer;

public class App extends BrowserVer implements ITestListener 
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			screenshots("C:\\Users\\koorosh\\eclipse-workspace2\\Verizon_Home\\ScreenshotVer\\PassVer\\PassVer");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			screenshots("C:\\Users\\koorosh\\eclipse-workspace2\\Verizon_Home\\ScreenshotVer\\FailVer\\FailVer\\FailVer");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
    
}