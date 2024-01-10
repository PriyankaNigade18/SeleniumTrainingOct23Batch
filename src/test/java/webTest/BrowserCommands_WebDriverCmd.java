package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands_WebDriverCmd 
{

	public static void main(String[] args)
	{
		//ctrl+shift+o

		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//To get the title- getTitle()
		System.out.println("Title is: "+driver.getTitle());
		
		//To get current url
		System.out.println("Current url is: "+driver.getCurrentUrl());
		
		//To get the source code of page- getPageSource()
		System.out.println(driver.getPageSource());
		
		//To close a browser -close() or quit()
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
