package newAutomationScenraio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_Window {

	public static void main(String[] args)
	{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			
			for(int i=1;i<=10;i++)
			{
			//new tab---facebook
			WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
			newTab.get("https://www.facebook.com");
			}
			
			//new window
			WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);
			newWindow.get("https://www.amazon.in");
			
			
			//driver.quit();
			
			
			

	}

}
