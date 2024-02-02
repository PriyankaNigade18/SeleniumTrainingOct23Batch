package pageObjectModel;

import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass
{
  @Test(priority=1)
  public void validateTitle()
  {
//	  LoginPage lp=new LoginPage();
//	  lp.getAppTitle();
	  
	  String actTitle=lp.getAppTitle();
	  System.out.println("Title is: "+actTitle);
  }
  
  
  
  @Test(priority=2)
  public void validateLogin()
  {
	  lp.doLogin("test@gmail.com","test123");
	  
  }
}
