package reportsdemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void reportTest()
  {
	  //create instance of ExtentReports
	  
	  ExtentReports extent = new ExtentReports();
	  //reporter for path
	  ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports/AutomationTest.html");
	  
	  //setup config
	  spark.config().setReportName("Automation Sprint1 report");
	  spark.config().setDocumentTitle("AutomationTestExtentReport");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attach report
	  extent.attachReporter(spark);
	  
	  //create test
	  ExtentTest test=extent.createTest("ExtentReportTest");
	  
	  //logs
	  test.log(Status.PASS, "This is pass status");
	  
	  test.log(Status.FAIL, "This is Fail status");
	  
	  test.log(Status.INFO, "This is Info status");
	  
	  test.log(Status.SKIP, "This is skip status");
	  
	  //flush the report
	  extent.flush();
  }
}
