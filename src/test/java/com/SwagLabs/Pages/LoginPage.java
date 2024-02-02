package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//locators
	private By usern=By.id("user-name");
	private By pas=By.id("password");
	private By btn=By.id("login-button");
	
	//methods
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getAppURl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public void doLogin(String un,String psw)
	{
		driver.findElement(usern).sendKeys(un);
		driver.findElement(pas).sendKeys(psw);
		driver.findElement(btn).click();
	}

}
