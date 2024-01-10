package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException
	{

		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("Title is: "+driver.getTitle());
		
		//google--->facebook in session (Navigation)
		driver.navigate().to("https://www.facebook.com");
		
		//static wait in selenium
		Thread.sleep(2000);
		
		System.out.println("Facebook app is open");
		//facebook--->google  (back)
		driver.navigate().back();
		
		
		Thread.sleep(2000);
		System.out.println("Google is open");

		//forward()
		driver.navigate().forward();
		
		Thread.sleep(2000);
		System.out.println("Facebook app is open");
		//refresh()
		driver.navigate().refresh();
		System.out.println("Facebook page is refreshed");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
