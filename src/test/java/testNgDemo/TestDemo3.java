package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3
{
  @Test(priority=1,description="This is test case1")
  public void registerTest() 
  {
	  System.out.println("This is register test for user");
  }
  
  
  @Test(priority=2,description="This is test case2",invocationCount=3)
  public void loginTest() 
  {
	  System.out.println("This is Login test for user");
  }
  
  
  @Test(priority=3)
  public void searchProductTest() 
  {
	  System.out.println("This is searchProduct test for user");
  }
  
  
  @Test(priority=4)
  public void addToCartTest() 
  {
	  System.out.println("This is AddTocart test for user");
  }
}
