package testNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo
{
  @Test(priority=1)
  public void hardAssertion() 
  {
	  
	  String act="Selenium webDriver is webui automation library!";
	  String exp="testng";
	  
	 // Assert.assertEquals(act,exp,"Fail: Strings are not equal!");
	  
	  //Assert.assertTrue(act.contains(exp),"Fail: Pass: No String is not a part of Actual String!");
	  
	  Assert.assertFalse(act.contains(exp),"Fail:  current String is a part of Actual String!");
	  System.out.println("Pass: Current string is not a part of actual string");
	  
	  System.out.println("Hard Assertion demo is completed!");
	  
	  
	  /*
	   * If assertion fails it always throw ASsertionError
	   */
	  
	  
	  
	  
  }
  
  
  
  
  @Test
  public void softAssertionTEst()
  {
	  
	  SoftAssert sf=new SoftAssert();
	  
	  int a=100,b=100;
	 
	 //sf.assertEquals(a,b,"Fail: Numbers are not equal!");
	  sf.assertTrue(a==b,"Fail: Numbers are not equal!");
	  System.out.println("Pass: Numbers are equal");
	  
	  sf.assertAll();
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
