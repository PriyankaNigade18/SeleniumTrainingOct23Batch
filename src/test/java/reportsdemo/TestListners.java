package reportsdemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListners 
{
  @Test
  public void testCase1() 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com");
	 Assert.assertTrue(driver.getTitle().contains("Google"),"Test Fail");
	 System.out.println("Test pass");
  }
  
  
  @Test
  public void testCase2() 
  {WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com");
	 Assert.assertTrue(driver.getTitle().contains("Googleapp"),"Test Fail");
	 System.out.println("Test pass");
	  
  }
}
