package week6.day3;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) {
		// Step1: set up the path
		ExtentHtmlReporter report=new ExtentHtmlReporter("./Reports/LeaftapsFunctionality.html");

		//Step2: Create a test
		ExtentReports extent=new ExtentReports();
		
		//Step3:Attach the test to the reports
		extent.attachReporter(report);
		
		//Ste4: Create a Testcase
		ExtentTest test = extent.createTest("Login", "Login with valid credentials");
		
		//Step5: add the status for this testcase
		test.pass("Username entered successfully");
		test.pass("Password entered successfully");
		test.pass("Login button clicked successfully");
		
		//Close the report
		extent.flush();
		
		System.out.println("Done");
	}

}
