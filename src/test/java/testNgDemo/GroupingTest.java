package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingTest {
  
	@Test(groups = "SmokeTest")
  
  public void testCase1()
  {
	  System.out.println("This is test case1 for Smoke scenario");
  }
  
    
  @Test(groups = "SmokeTest")
  public void testCase2()
  {
	  System.out.println("This is test case2 for Smoke scenario");
  }
  
  
  @Test(groups = "FunctionalTest")
  public void testCase3()
  {
	  System.out.println("This is test case3 for Functional scenario");
  }
  
  
  
  @Test(groups = "FunctionalTest")
  public void testCase4()
  {
	  System.out.println("This is test case4 for Functional scenario");
  }
  
  
  @Test(groups = "RegressionTest")
  public void testCase5()
  {
	  System.out.println("This is test case5 for Regression scenario");
  }
  
  
  
  
  @Test(groups = "RegressionTest")
  public void testCase6()
  {
	  System.out.println("This is test case5 for Regression scenario");
  }
}
