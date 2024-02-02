package realTimeAnnotationUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
	}

	
	
	
	@AfterClass
	  public void tearDown() throws InterruptedException
	  {
		  Thread.sleep(4000);
		  driver.quit();
	  }
	  
	  
	  @BeforeMethod
	  public void getCurrentAppUrl()
	  {
		System.out.println("Current url is: "+driver.getCurrentUrl());  
	  }
	  
	  
	  @AfterMethod
	  public void getAppTitle()
	  {
		  System.out.println("Title of the page is: "+driver.getTitle());
	  }
	  
}
