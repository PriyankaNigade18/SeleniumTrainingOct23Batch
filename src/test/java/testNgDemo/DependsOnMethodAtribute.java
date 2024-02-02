package testNgDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodAtribute
{
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("This is registration process for user");
	  //Assertion -validate test case
	  
	  AssertJUnit.assertEquals(100,10);//fail
  }
  
  @Test(priority=2,dependsOnMethods="registerTest",alwaysRun=true)
  public void loginTest()
  {
	  System.out.println("This is Login process for user");
  }
}
