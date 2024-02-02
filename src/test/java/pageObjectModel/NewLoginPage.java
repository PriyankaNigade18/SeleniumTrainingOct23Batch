package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLoginPage 
{
	private WebDriver driver;
	
	
	//initialize driver
	public NewLoginPage(WebDriver driver)//base class driver
	{
		this.driver=driver;
	}
	
	
	//locators-@FindBy
	
	private @FindBy(id="email-id")
			WebElement email;
	
	private @FindBy(id="password")
		WebElement psw;
	
	private @FindBy(id="submit-id")
		WebElement btn;
	
	//methods
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String em,String ps)
	{
		email.sendKeys(em);
		psw.sendKeys(ps);
		btn.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
