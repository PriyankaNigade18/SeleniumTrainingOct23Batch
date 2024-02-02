package pageObjectModel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewLoginPageTestCase extends BaseClass
{
  @Test(priority=1)
  public void validateTitle() 
  {
	  String actTitle=np.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Login"),"Title not matched!");
	  System.out.println("Current title is: "+actTitle);
	  
//	  if(actTitle.contains("Login"))
//	  {
//		  System.out.println("Current title is: "+actTitle);
//	  }else
//	  {
//		  System.out.println("Title not matched!");
//	  }
  }
  
  
  @Test(priority=2)
  public void validateLogin()
  {
	  np.doLogin("test@gmail.com", "test123");
	  String exp="customers";
	  Assert.assertTrue(driver.getCurrentUrl().contains(exp),"Login Fail");
	  System.out.println("Login Pass");
	  
//	  if(driver.getCurrentUrl().contains(exp))
//	  {
//		  System.out.println("Login Test Pass");
//	  }else
//	  {
//		  System.out.println("Login Test Fail");
//	  }
	  
	  
  }
}
