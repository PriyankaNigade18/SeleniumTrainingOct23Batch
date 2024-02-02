package realTimeAnnotationUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class CRMTest extends BaseClass
{
	//public WebDriver driver;
	
//	@BeforeClass
//	public void setUp()
//	{
//		driver=new ChromeDriver();
//		driver.get("https://automationplayground.com/crm/");
//	}
	
  @Test(priority=1)
  public void validateSignInLink() 
  {
	  driver.findElement(By.id("SignIn")).click();
  }
  
  
  @Test(priority=2)
  public void validateLogin()
  {
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test1234");
	  driver.findElement(By.id("submit-id")).click();
	  
  }
  
//  @AfterClass
//  public void tearDown() throws InterruptedException
//  {
//	  Thread.sleep(4000);
//	  driver.quit();
//  }
//  
//  
//  @BeforeMethod
//  public void getCurrentAppUrl()
//  {
//	System.out.println("Current url is: "+driver.getCurrentUrl());  
//  }
//  
//  
//  @AfterMethod
//  public void getAppTitle()
//  {
//	  System.out.println("Title of the page is: "+driver.getTitle());
//  }
//  
}
