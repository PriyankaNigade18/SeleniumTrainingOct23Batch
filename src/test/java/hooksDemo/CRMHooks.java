package hooksDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CRMHooks 
{
	
	public WebDriver driver;
	@Before
	public void setUp()
	{
		//driver=new ChromeDriver();
	driver=BrowserSetup.setDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://automationplayground.com/crm/");
		
	}
	
	
	@Before("@Login")
	public void pageOpen()
	{
		driver.findElement(By.id("SignIn")).click();
	}
	
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
