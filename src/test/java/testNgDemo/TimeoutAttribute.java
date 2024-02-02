package testNgDemo;

import org.testng.annotations.Test;

public class TimeoutAttribute {
  @Test
  public void testCase1() 
  {
	  System.out.println("This is test1");
	  
  }
  
  @Test(timeOut = 3000)
  public void testCase2() throws InterruptedException 
  {
	  Thread.sleep(4000);
	  System.out.println("This is test2");
	 
	  
  }
}
