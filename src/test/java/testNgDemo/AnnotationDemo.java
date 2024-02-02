package testNgDemo;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationDemo {
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("This is register test");
	  
  }
    
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("This is login test");
	  
  }
  
  
  @Test(priority=3)
  public void logoutTest() 
  {
	  System.out.println("This is logout test");
	  
  }
  
  //Annotations
  @BeforeMethod
  public void bMethod()
  {
	  System.out.println("BeforeMethod executes before every test case");
  }
  
  @AfterMethod
  public void aMethod()
  {
	  System.out.println("AfterMethod exeutes after every test case");
  }
  
  @BeforeClass
  public void bClass()
  {
	  System.out.println("BeforeClass executes before first test case ");
  }
  
  
  @AfterClass
  public void aClass()
  {
	  System.out.println("AfterClass executes after last test case ");
  }
  
  
  @BeforeTest
  public void bTest()
  {
	  System.out.println("BeforeTest executes before every class ");
  }
  
  
  
  @AfterTest
  public void aTest()
  {
	  System.out.println("AfterTest executes after every class ");
  }
  
  
  @BeforeSuite
  public void bSuite()
  {
	  System.out.println("BeforeSuite executes before test ");
  }
  
  
  @AfterSuite
  public void aSuite()
  {
	  System.out.println("AfterSuite executes after test ");
  }
  
  
  
  
  
  
  
  
}
