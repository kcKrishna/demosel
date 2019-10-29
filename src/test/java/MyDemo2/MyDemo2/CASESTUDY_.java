package MyDemo2.MyDemo2;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CASESTUDY_ {
	WebDriver drive;
	ExtentReports extent;
	ExtentTest test;
	ExtentHtmlReporter htmlReporter; 
	@BeforeTest
	public void startreportBeforetest() {
		
	}
	@AfterMethod
	public void getresultAftermethod(ITestResult result) {
		
	}
	@AfterTest
	public void endreportAfterTest() {
		extent.flush();
	}
  @Test(priority = 1)
  public void TestRgistration() {
  }
}
