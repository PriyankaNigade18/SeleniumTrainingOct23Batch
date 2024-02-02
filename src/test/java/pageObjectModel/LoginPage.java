package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//Encapsulation= private data+ public Functions
	
	private WebDriver driver;
	
	
	//Initilize driver
	public LoginPage(WebDriver driver)//driver from base class
	{
		this.driver=driver;
	}
	
	
	
	//locators-by locator
	private By email=By.id("email-id");
	private By psw=By.id("password");
	private By btn=By.id("submit-id");
	
	//methods 
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String em,String ps)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(psw).sendKeys(ps);
		driver.findElement(btn).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
