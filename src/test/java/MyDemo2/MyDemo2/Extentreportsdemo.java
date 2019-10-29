package MyDemo2.MyDemo2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.mongodb.MapReduceCommand.OutputType;

public class Extentreportsdemo {
  WebDriver drive;
  ExtentReports extent;
  ExtentTest test;
  ExtentHtmlReporter htmlReporter; 
	@BeforeTest
		public void intitalization() {
		 	//initializing the HtmlReporter
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/testReport1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setDocumentTitle("REPORT");
		htmlReporter.config().setReportName("TEST REPORT");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd,yyyy, hh:mm a '('zzz')'");
		
	}
	
	@Test
  public void f() {
		test = extent.createTest("test_case1","first");
		drive = Drivers.getDriver("Chrome");
		drive.get("https://www.google.co.in/");
		Assert.assertEquals("Google", drive.getTitle());
  }
	@Test
	public void g() {
		test = extent.createTest("test_case2","second_case");
		Assert.assertTrue(true);
	}
	@Test
	public void h() {
		test = extent.createTest("test_case3","third_case");
		Assert.assertTrue(false);
	}
	@AfterMethod
	public void getReport(ITestResult result) throws IOException {
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Failed", ExtentColor.RED));
			TakesScreenshot snapshot =   (TakesScreenshot)drive;
            File src = snapshot.getScreenshotAs(OutputType.FILE);
            String Path = System.getProperty("user.dir") +"/test-output/screens/"+result.getName()+".png";
            FileUtils.copyFile(src, new File(Path));
            test.addScreenCaptureFromPath(Path, result.getName());
            test.fail(result.getThrowable());
			
		}
		else if(result.getStatus()== ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"passed", ExtentColor.GREEN));
			
		}
		else if(result.getStatus()== ITestResult.SKIP) {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"NORUN", ExtentColor.BLUE));
		}
	}
	@AfterTest
	public void finalreport() {
		extent.flush();
	}
}

