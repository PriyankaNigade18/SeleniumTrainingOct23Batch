package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class BaseClass 

{
	public WebDriver driver;
	public LoginPage lp;
	public NewLoginPage np;
	
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		//By locator
		lp=new LoginPage(driver);
		//@FindBy
		np=PageFactory.initElements(driver,NewLoginPage.class);
	}
	
	
	
	
	
	
}
