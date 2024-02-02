package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;

public class BaseClass 
{
	
	public WebDriver driver;
	public LoginPage  lp;
	public InventoryPage ip;
	
	@BeforeTest
	public void AppSetUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		
		
		
		
	}
	
	
	
	
	@BeforeClass
	public void pageSetUp()
	{
		System.out.println("***********Login***************");
		System.out.println("Application url: "+lp.getAppURl() );
		System.out.println("Application title:"+lp.getAppTitle());
		lp.doLogin("standard_user","secret_sauce");
		System.out.println("***********Inventory**************");
		
		
		
	}
	
	
	

}
