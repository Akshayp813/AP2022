package CornerstoneFG;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Base {
	
	ExtentReports report;
	ExtentHtmlReporter htmlReporter;
	ExtentTest logger;

	@BeforeMethod
	public void startTest() {

		
		// Provide the Report Path
		htmlReporter = new ExtentHtmlReporter(".//test-output//extentreport.html");
		report.attachReporter(htmlReporter);
		//report.setSystemInfo("Host Name", "Anshul-702HK");
		//report.setSystemInfo("Env", "Automation Testing");
		//report.setSystemInfo("User", "Anshul Chauhan");
	}
	
	
	
	@Test
	public void PostJiraOne()
	{
		System.out.println("Post Jira");
		Assert.assertTrue(true);
	}
	
	
	@AfterMethod
	public void getTestResult(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE)
        {
			logger.fail(result.getName());
			logger.fail(result.getThrowable());
			
        }
		else if (result.getStatus() == ITestResult.SUCCESS) {
	     logger.pass(result.getName());
		
		}
		else if(result.getStatus() == ITestResult.SKIP){
			logger.skip("Test Case Skipped is "+result.getName());
		} 
		} 
	}
	
