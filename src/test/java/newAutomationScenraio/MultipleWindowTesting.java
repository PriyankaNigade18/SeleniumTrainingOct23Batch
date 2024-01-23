package newAutomationScenraio;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowTesting {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//parent page
		
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		//link
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//new page will open
		Set<String> allWindows=driver.getWindowHandles();
		
		System.out.println(allWindows);
		
		//child window
		for(String childId:allWindows)
		{
			if(!parentId.equals(childId))//parent id is not equals with child id then switch
			{
				//child window
				driver.switchTo().window(childId);
				driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("test@gmali.com");
				//driver.close();//child
				//driver.quit();//all open window
				
			}
		}
		
		
		//parent window
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		
		
		
		
		
		
		
		
		

	}

}
