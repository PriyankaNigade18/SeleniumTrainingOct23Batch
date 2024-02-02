package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DisableTestFromExecution_enabled 
{
	@Test(priority=1,description="This is test case1")
	  public void registerTest() 
	  {
		  System.out.println("This is register test for user");
	  }
	  
	  
	  @Test(priority=2)
	  public void loginTest() 
	  {
		  System.out.println("This is Login test for user");
	  }
	/*
	 * Disable test from execution
	 * Way1: using attribute enabled=false
	 * Way2: exclude that method from xml file  
	 */
	  
	  @Test(priority=3,enabled=false)
	  public void searchProductTest() 
	  {
		  System.out.println("This is searchProduct test for user");
	  }
	  

	  
	  @Test(priority=4)
	  public void logout()
	  {
		  System.out.println("This is logout test");
	  }
}
