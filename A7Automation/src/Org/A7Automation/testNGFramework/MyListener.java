package Org.A7Automation.testNGFramework;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("[TestCase"+result.getName()+"has started]", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("[TestCase"+result.getName()+"has Successfully executed ]", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("[TestCase"+result.getName()+"has Failed ]", true);
		String ldt = LocalDateTime.now().toString(); 
		     String dateTime = ldt.replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dist=new File("./ErrorShots/"+result.getName()+dateTime+".png");
	
			try {
				FileHandler.copy(src, dist);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		    
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[TestCase"+result.getName()+"has Skipped]", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("[TestCase"+result.getName()+"has failed but within success percentage]", true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("[TestCase"+result.getName()+"has Failed with TimeOut]", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("<Test>"+context.getName()+"has started", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("<Test>"+context.getName()+"has Finished", true);
	}

	

}
